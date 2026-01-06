package com.tnsif.multithreading.threadclass;

public class ThreadDemo {
	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread();
		ChildThread threadTwo = new ChildThread();

		threadOne.start();
		
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
}



