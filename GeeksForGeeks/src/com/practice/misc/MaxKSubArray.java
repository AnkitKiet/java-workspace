package com.practice.misc;

import java.util.Deque;
import java.util.LinkedList;

public class MaxKSubArray {

	public static void main(String[] args) {

		int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
		int n = arr.length;
		int k = 3;
		Deque<Integer> Qi = new LinkedList<>();
		int i;
		for (i = 0; i < k; i++) {

			while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
				Qi.removeLast();
			}
			Qi.addLast(i);
		}

		for (; i < n; i++) {
			System.out.println(arr[Qi.peek()] + " ");

			while (!Qi.isEmpty() && Qi.peek() <= i - k) {
				Qi.removeFirst();
			}
			while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
				Qi.removeLast();
			}
			Qi.addLast(i);
		}
		System.out.println(arr[Qi.peek()]);
	}

}
