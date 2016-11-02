package com.gecko.util;

/**
 * Created by hlieu on 11/1/16.
 */
// an implementation of a two's complement system
public class TwosComplementImpl {

    // the binary representation of the number,
    // and the number of bits
    public static int twosComplement(String binary, int n_bits) {

        int val = 0;
        boolean isNegative = false;

        // reverse the string and then get it's char[] because
        // an input string of eg 1110 comes out as [1, 1, 1, 0]
        // but we actually want our lowest bits - the 0 - to be
        // first eg [0, 1, 1, 1], so we reverse it
        char[] bin = new StringBuilder(binary).reverse().toString().toCharArray();
        for(int i = 0; i < bin.length; i++) {
            int c = Character.getNumericValue(bin[i]);
            val += ( c * (int) Math.pow(2, i) );

            //
            isNegative = c == 1;
        }

        double two_n_radix = Math.pow(2, n_bits);
        return isNegative ? ((int) two_n_radix - val) * -1 : val;
    }


}
