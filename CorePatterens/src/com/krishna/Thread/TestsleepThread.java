package com.krishna.Thread;

public class TestsleepThread extends Thread {
	public void start() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(50);

			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestsleepThread ts = new TestsleepThread();
		TestsleepThread ts1 = new TestsleepThread();
		ts.start();
		ts1.start();

	}

}
