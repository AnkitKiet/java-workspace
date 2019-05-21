package com.practice.maths;

import java.util.Scanner;
import com.practice.util.Logging;

public class Factorial extends Logging{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			System.out.println(fact(n));
		}
		scanner.close();
	}

	private static int fact(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}

	}

}
