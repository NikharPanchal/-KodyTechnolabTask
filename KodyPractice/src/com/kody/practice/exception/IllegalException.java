package com.kody.practice.exception;

/**
 * @objective Example of illegalException
 * @Developer Nikhar
 * @Date 10-Jun-2022
 */
public class IllegalException {

	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
		}
	}
}
