package com.practice.maths;

import java.util.Scanner;

/*
 * Given a positive integer N, find the Nth Even Fibonacci number. Since the answer can be very large, print the answer modulo 1000000007.
 */
public class NEvenFibNum {

	static long fib(long n) {
		long a = 0;
		long b = 1;
		long c;
		if (n == 0) {
			return a;
		} else {
			for (int i = 2; i <= n; i++) {
				c = a + b;
				a = b;
				b = c%1000000007;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			long n = sc.nextLong();
			System.out.println(fib(n * 3));
		}
		sc.close();
	}

}
