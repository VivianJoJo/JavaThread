package com.thread;

public class ArmyRunnable implements Runnable {

	volatile boolean keepRunning = true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (keepRunning) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " fighting......" + i);
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + " ending....");
	}
}
