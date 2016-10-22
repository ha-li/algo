package com.gecko.util;

/**
 * Created by hlieu on 10/21/16.
 */
public class BinaryUtils {
    public static String toBinaryString(int i) {
        StringBuffer sb = new StringBuffer();

        int op = i;
        int r = 0;
        while(op > 0) {
            r = op % 2;
            op = op >> 1;
            sb.append(r);
        }

        return sb.reverse().toString();
    }
}
