package com.practice.maths;

import java.util.Scanner;

public class LCMGCD {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int gcd = 1;
		for (int j = 0; j < t; j++) {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();

			for (int i = 1; i <= n1 && i <= n2; ++i) {
				// Checks if i is factor of both integers
				if (n1 % i == 0 && n2 % i == 0)
					gcd = i;
			}
			
			int lcm = (n1 * n2) / gcd;
			System.out.printf(lcm +" "+ gcd);

		}
		scanner.close();
	}

}
