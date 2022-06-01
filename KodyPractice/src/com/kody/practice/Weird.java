/*Given an integer, n, perform the following conditional actions:

 If n  is odd, print Weird
 If n  is even and in the inclusive range of  2 to 5 , print Not Weird
 If n  is even and in the inclusive range of  6 to 20 , print Weird
 If n  is even and greater than 20, print Not Weird

Input Format
A single line containing a positive integer, n.

output Format
Print Weird if the number is weird; otherwise, print Not Weird.
*/
package com.kody.practice;

import java.util.Scanner;

public class Weird {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the number :- ");
		int n = sc.nextInt();
		// check number is odd
		if (n % 2 != 0) {
			System.out.println("Weird");
		} else {// number is even
			if (n >= 2 && n <= 5) {
				System.out.println("Not Weird");
			} else if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			} else if (n > 20) {
				System.out.println("Not Weird");
			} else {
				System.out.println("Negative number not allowed");
			}
		}
		sc.close();
	}
}
