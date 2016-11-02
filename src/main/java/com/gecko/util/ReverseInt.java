package com.gecko.util;

/**
 * Created by hlieu on 11/1/16.
 */
public class ReverseInt {

    // reverse number - does not protecte against overflows...
    public static int reverse(int number) {
        int rev = 0;

        // is it negative
        boolean neg = number < 0 ? true : false;

        // get the abs
        int abs = abs(number);

        // reconstruct the reverse of abs
        while ( abs > 0 ) {
            rev *= 10;
            int mod = abs % 10;
            rev += mod;
            abs /= 10;
        }

        if( (rev < 0 && number > 0) || (rev > 0 && number < 0) ) {
            // overflowed, return 0
            throw new StackOverflowError("stack over flowed");
        }

        // apply the negative as appropriate
        return neg ? -1 * rev : rev ;
    }

    private static int abs(int number) {
        return number < 0 ? -1 * number : number;
    }

    /* public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        max = max + 1;
        System.out.println(max);
    } */
}
