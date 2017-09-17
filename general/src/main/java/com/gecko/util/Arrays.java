package com.gecko.util;

public class Arrays {
	public static void main(String[] args) {
	    char t = 'a';
        System.out.println ((int) t);
        System.out.println (t);
        System.out.println ((double)t);
        System.out.println ( Integer.toHexString(t) );

        int[] i = {t};
        for(int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }
}
