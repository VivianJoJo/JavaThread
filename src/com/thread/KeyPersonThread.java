package com.thread;

public class KeyPersonThread extends Thread {

	public void run() {
		System.out.println(getName() + " begin fighting....");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "fighting!" + i);
		}
		System.out.println(Thread.currentThread().getName() + " over!");
	}
}
