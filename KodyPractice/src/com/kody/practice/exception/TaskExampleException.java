package com.kody.practice.exception;
/**
 * @objective This is the first demo of the Exception
 * @Developer Nikhar
 * @Date 08-Jun-2022 
 * 		 Note :Only checked exceptions are required to be thrown
 *       using the throws keyword. Unchecked exceptions don’t need to be thrown
 *       or handled explicitly in code.
 *       
 *       Checked Exception  
 *       -ClassNotFoundException
 *       -InterruptedException
 *       -IOException
 *       -InstantiationException
 *       -SQLException
 *       -FilNot Found Exception
 *       -IllegalAccessException
 *       
 *       UnCheckedException 
 *       -ArithmaticException
 *       -ClassCastException
 *       -NullPointerExcepttion
 *       -InputMisMatchedException
 *       -ArrayIndexOutOufBoundException
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
