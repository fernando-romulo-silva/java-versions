package org.java.versions.virtual_threads;

import static java.lang.System.out;

public class Main01 {

    static final int numberOfThreads = 1_000_000;
    
    static class BlockedThread implements Runnable{

	private final int number;
	
	BlockedThread(int number) {
	    super();
	    this.number = number;
	}

	@Override
	public void run() {
	    out.println("Java thread number " + number);
	}
    }
    
    static void oldVersion() {
	
	Runnable runnable = () -> {
	    // your code here
	    out.println("Old thread!");
	};

	
	final var thread01 = new Thread(runnable);
	thread01.start();
	
	
	// -----------
	
	final var thread02 = Thread.ofPlatform()
			.daemon()
			.name("my-custom-thread")
			.unstarted(runnable);
	
	thread02.start();

    }
    
    static void java11Version() {
	
	for (int i = 0; i < numberOfThreads; i++) {

	    final var thread = Thread.ofPlatform()
				.daemon()
				.name("my-custom-thread "+i)
				.unstarted(new BlockedThread(i));

	    thread.start();

	    String str = String.format("Java 11 thread number %s is running.", i);

	    out.println(str);

	}	
    }

    
    static void newVersion() {

	for (int i = 0; i < numberOfThreads; i++) {

	    final var virtualThread = Thread.ofVirtual().unstarted(new BlockedThread(i));

	    virtualThread.start();

	    String str = String.format("Java 21 virtual thread number %s is running.", i);

	    out.println(str);

	}
    }
    
    

    public static void main(String[] args) {
	java11Version();
    }

}
