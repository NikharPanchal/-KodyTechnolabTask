package com.kody.practice.exception;

/**
 * @objective Program of throw keyword and rethrow
 * @Developer Nikhar
 * @Date 09-Jun-2022
 */
public class ThrowKeyword {

	static void demo() throws NullPointerException {
		try {
			throw new NullPointerException("Null pointer error");

		} catch (NullPointerException e) {
			System.out.println("Caught inside demo method");
			throw e;// rethrow
		}
	}

	public static void main(String[] args) {
		try {
			demo();
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("rest of the code...");
		}
	}
}