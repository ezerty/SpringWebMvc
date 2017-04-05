package com.mycompany.springmvcexample;

import java.util.HashMap;
import java.util.Map;

public class Request {
	

		private String name;

		private int count;

		private Map<String, String> customColumns = new HashMap<>();

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public Map<String, String> getCustomColumns() {
			return customColumns;
		}

		public void setCustomColumns(Map<String, String> customColumns) {
			this.customColumns = customColumns;
		}

		@Override
		public String toString() {
			return "Request{" + "name=" + name + ", count=" + count + ", customColumns=" + customColumns + '}';
		}

}
