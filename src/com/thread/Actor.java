package com.thread;

public class Actor extends Thread {

	public void run() {
		System.out.println("Name is : " + getName() + " begin");
		int count = 0;
		boolean keepRun = true;

		while (keepRun) {
			System.out.println(getName() + " is NO : " + count++);

			if (count == 100)
				keepRun = false;

			if (count % 10 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		System.out.println("Name is : " + getName() + " is over");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread actor = new Actor();
		actor.setName("vivian.yu");
		actor.start();

		Thread actress = new Thread(new Actress(), "Efren.yang");
		actress.start();
	}

}

class Actress implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Name is : " + Thread.currentThread().getName() + " begin");
		int count = 0;
		boolean keepRun = true;

		while (keepRun) {
			System.out.println(Thread.currentThread().getName() + " is NO : " + count++);

			if (count == 100)
				keepRun = false;

			if (count % 10 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		System.out.println("Name is : " + Thread.currentThread().getName() + " is over");
	}

}
