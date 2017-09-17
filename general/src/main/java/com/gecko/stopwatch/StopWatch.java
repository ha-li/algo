package com.gecko.stopwatch;

public class StopWatch {
	
	private final long start;
	
	private final double MILLI_IN_SEC = 1000;
	
	public StopWatch() {
		start = System.currentTimeMillis();
	}
	
	// returns the time in secs
	public double time() {
		return System.currentTimeMillis()/MILLI_IN_SEC;
	}
	
	public double elapsedTime() {
		double now = System.currentTimeMillis();
		return (now - start)/MILLI_IN_SEC;
	}
}
