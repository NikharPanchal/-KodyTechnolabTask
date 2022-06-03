package com.kody.practice.finalkeyword;


/**
 * @objective
 * @Developer Nikhar
 * @Date 02-Jun-2022
 */

class Test {
	final int a;
	// final static int a;
	{
		a = 50;
	}

	Test() {

		System.out.println("Value of a :-" + a);
	}

	static {

	}
}

class Test2 {

}

public class FinalVariable {

	public static void main(String[] args) {
		Test2 ibj1 = new Test2();
		System.out.println(ibj1);
	}
}