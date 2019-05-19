package com.practice.maths;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		for(int i=0;i<t;i++){
			int n = scanner.nextInt();
			System.out.println(fact(n));
		}
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==1){
			return 1;
		}else{
			return n*fact(n-1);
		}
	
	}
	
}
