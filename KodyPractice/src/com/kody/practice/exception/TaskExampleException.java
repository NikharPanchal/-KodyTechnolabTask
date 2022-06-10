package com.kody.practice.exception;

/**
 * @objective This is the first demo of the Exception
 * @Developer Nikhar
 * @Date 08-Jun-2022
 */
public class TaskExampleException {

	public static void main(String[] args) {

		try {

			int[] array = new int[5];
			array[6] = 10;// Error - store value in 6 position

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}

	}
}
