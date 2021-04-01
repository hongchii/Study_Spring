package com.javalec.ex;

public class Calculator {
	public void add(int f, int s) {
		System.out.println("add()");
		int result = f + s;
		System.out.println(f + "+" + s + "=" + result);
	}

	public void sub(int f, int s) {
		System.out.println("sub()");
		int result = f - s;
		System.out.println(f + "-" + s + "=" + result);
	}

	public void mult(int f, int s) {
		System.out.println("mult()");
		int result = f * s;
		System.out.println(f + "*" + s + "=" + result);
	}

	public void div(int f, int s) {
		System.out.println("div()");
		int result = f / s;
		System.out.println(f + "/" + s + "=" + result);
	}
}
