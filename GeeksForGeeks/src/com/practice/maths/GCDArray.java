package com.practice.maths;

import java.util.Scanner;

/*
 * Given an array of N positive integers. Your task is to find the GCD of all numbers of the array.
 */

public class GCDArray {

	static long gcd(long arr, long result) {
		if (arr == 0)
			return result;
		else {
			return gcd(result % arr, arr);
		}

	}

	static long findGcd(long[] arr) {
		long result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result = gcd(arr[i], result);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int j = 0; j < t; j++) {
			int n = scanner.nextInt();
			long arr[] = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextLong();
			}
			System.out.println(findGcd(arr));
		}
		scanner.close();
	}

}
