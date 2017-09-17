package com.gecko;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateClient {

	@Test
	public void testDate() {
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
