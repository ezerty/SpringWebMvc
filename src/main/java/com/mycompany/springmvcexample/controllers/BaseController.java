package com.mycompany.springmvcexample.controllers;


import com.mycompany.springmvcexample.Request;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BaseController {


	@RequestMapping(value = "/wrappedRequest", method = RequestMethod.POST)
	public Object handleWrappedRequest(@RequestBody Request request) {
		System.out.println(request);
		return request;
	}

	@RequestMapping(value = "/separatedRequest/{name}/{count}", method = RequestMethod.GET)
	public Object handleSeparatedRequest(@PathVariable("name") String name, @PathVariable("count") Integer count,
			@RequestParam Map<String, String> customColumns) {
		Request request = new Request();
		request.setName(name);
		request.setCount(count);
		request.setCustomColumns(customColumns);
		System.out.println(request);
		return request;
	}

}
