package com.tnsif.multithreading.threadclass;

public class ChildThread extends Thread {
	
	class SimpleThread extends Thread {

	    int n;
	    String msg;

	    // Constructor
	    SimpleThread(int n, String msg) {
	        this.n = n;
	        this.msg = msg;
	    }

	    // run method
	    public void run() {
	        for (int i = 1; i <= n; i++) {
	            try {
	                Thread.sleep(500);   // pause thread
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted");
	            }
	            System.out.println(msg + " " + i);
	        }
	    }
	}


}
