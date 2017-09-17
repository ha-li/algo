package com.gecko;

import org.junit.Test;

public class StringClient {

	@Test
	public void main() {
		// TODO Auto-generated method stub
		String s1 = "new String";
		String s2 = s1.concat(" gets tricky here");
		System.out.println(s1);  // strings are immutable, so this does not change s1, rather it creates a new string and returns it
		System.out.println(s2);  // this is the return value of the concat
		
		// likewise, here s1 is not changed even though we call lowers
		String s3 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s3);
		
		
	}

}
