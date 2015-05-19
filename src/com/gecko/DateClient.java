package com.gecko;

import java.util.Date;

import java.util.Calendar;

public class DateClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = Calendar.getInstance().getTime();
		System.out.println(d);

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2013);
		Date d2 = c.getTime();
		
		System.out.println(d);
		System.out.println(d2);
		
		d = d2;
		
		System.out.println(d);
		System.out.println(d2);
		
		
	}

}
