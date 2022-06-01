/*Write a program to check factorial pattern*/
package com.kody.practice;

import java.util.Scanner;

public class FactorialNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int factorial = 1;
		System.out.println("Enter the number :- ");
		int no = sc.nextInt();
		for (int i = 2; i <= no; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + no + " is :- " + factorial);
		sc.close();
	}
}
