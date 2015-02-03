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
	}

}
