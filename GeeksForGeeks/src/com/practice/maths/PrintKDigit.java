package com.practice.maths;

import java.util.Scanner;

/*
 * Given two numbers A and B, find Kth digit from right of AB.
 */
public class PrintKDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		String result =String.valueOf((long)Math.pow(a, b));
		System.out.println(result.split("")[(int) (result.length()-k)]);
		sc.close();
	}

}
