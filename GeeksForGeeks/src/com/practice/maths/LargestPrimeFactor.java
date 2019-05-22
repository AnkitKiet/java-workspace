package com.practice.maths;

import java.util.Scanner;

/*
 * Given a number N, the task is to find the largest prime factor of that number.
 */
public class LargestPrimeFactor {

	static long maxPrimeFactor(long n) {
		long max = -1;

		while (n % 2 == 0) {
			max = 2;
			n /= 2;
		}
		for (int i = 3; i <=Math.sqrt(n); i+=2) {
			while (n % i == 0) {
				max = i;
				n /= i;
			}
		}

		if (n > 2)
			max = n;

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			long n = sc.nextLong();
			System.out.println(maxPrimeFactor(n));
		}
		sc.close();
	}

}
