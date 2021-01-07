package com.andi;

import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String, String> env = System.getenv();
		for (String key : env.keySet()) {
			System.out.printf("%s: %s\r\n", key, env.get(key));
		}
	}
}
