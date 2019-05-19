package com.practice.maths;

import java.util.Scanner;

/*
 * Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series. 
 * 
 * Input:
 * The first line of input contains an integer, the number of test cases T. T testcases follow. Each testcase in its first line should contain two positive integer A and B(First 2 terms of AP). In the second line of every testcase it contains of an integer N.
 *
 * Output:
 * For each testcase, in a new line, print the Nth term of the Arithmetic Progression.
 */

public class SeriesAp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0;i<t;i++){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			System.out.println(a+(n-1)*(b-a));
		}
		scanner.close();
	}

}
