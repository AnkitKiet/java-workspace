package com.practice.runnablethread;

import java.util.concurrent.TimeUnit;

public class RunnableThread {

	public static void main(String[] args) {
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName);
		};
		// Runnable Task will run on main thread
		task.run();

		// Implementing with TimeUnit class
		Runnable task2 = () -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Hello");
				String threadName = Thread.currentThread().getName();
				System.out.println("task2--"+threadName);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		task2.run();
		
		// Attaching Task with a thread
		Thread thread = new Thread(task);
		thread.start();
		Thread thread2 = new Thread(task2);
		thread2.start();

	}

}
