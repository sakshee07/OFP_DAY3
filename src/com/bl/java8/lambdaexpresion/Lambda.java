package com.bl.java8.lambdaexpresion;

import java.util.ArrayList;
import java.util.List;

public interface Lambda {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("1");
		list.add("2");
		System.out.println("foreach ");
		list.forEach(a -> System.out.println(a));
		
		System.out.println("start thread");
		new Thread(
				() -> System.out.println("My runnable")
				).start();
		
		
		
	}
}
