package com.kody.enumandvarcargs;

/**
 * @objective
 * @Developer Nikhar
 * @Date 21-Jun-2022
 */
public class VarArgsProgram {
	static void vaTest(int... v) {
		System.out.print("Number of args: " + v.length + " Contents: ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String args[]) {
	
		vaTest(10); 
		vaTest(1, 2, 3);
		vaTest();
	}
}
