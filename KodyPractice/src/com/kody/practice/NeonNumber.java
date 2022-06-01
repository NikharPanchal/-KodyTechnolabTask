/*Write a program to check neon number*/
package com.kody.practice;

import java.util.Scanner;

public class NeonNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int reminder = 0, sum = 0;
		sc = new Scanner(System.in);
		System.out.print("Enter the number :- ");
		int no = sc.nextInt();
		int square = no * no;
		System.out.println("Square of " + no + " is :- " + square);
		while (square > 0) {
			reminder = square % 10;
			sum = sum + reminder;
			square = square / 10;
		}
		System.out.println("Sum is :- " + sum);
		if (sum == no) {
			System.out.println(no + " is Neon number");
		} else {
			System.out.println(no + " is not Neon number");
		}
		sc.close();
	}
}
