package com.kody.practice.exception;

/**
 * @objective This is the first demo of the Exception
 * @Developer Nikhar
 * @Date 08-Jun-2022
 */
public class DemoException {

	public static void main(String[] args) {

		try {

			int[] array = new int[5];
			array[6] = 10;

		} catch (NullPointerException e) {
			System.out.println("value is out of bound in array");
		}
	}
}
