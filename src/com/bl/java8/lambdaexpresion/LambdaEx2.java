package com.bl.java8.lambdaexpresion;

import java.util.ArrayList;

public class LambdaEx2 {
	public static void main(String[] args) {
		
	ArrayList<Integer>arrayList = new ArrayList<>();
	arrayList.add(12);
	arrayList.add(122);
	arrayList.add(121);
	arrayList.add(124);
	arrayList.add(1211);
	arrayList.forEach(a ->System.out.println(a));
	}
}