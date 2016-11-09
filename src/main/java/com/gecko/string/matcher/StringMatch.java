package com.gecko.string.matcher;

/**
 * Created by hlieu on 11/8/16.
 */
public class StringMatch {

    // a brute force string matching algorithm
    public static int match(String template, String pattern) {
        int ret = -1;

        int t = template.length();
        int p = pattern.length();

        boolean match = false;

        // start at the template and go until the length
        // of the template permits (eg if template is 2, then
        // can only search until template length - 2
        for( int i = 0; i <= t - p; i++ ) {

            // at each starting point, we compare
            // the pattern until we find a mismatch
            for( int j = 0; j < p; j++ ) {
                if(template.charAt(i+j) != pattern.charAt(j)){
                    //match = false;
                    break;
                }

                // if we reach the point of j == p - 1
                // we have search through all of the pattern
                // without finding a mismatch,
                // so we found a match
                if ( j == p - 1 ) {
                    match = true;
                    break;
                }
            }

            // once we found it, we can end it
            if(match == true) {
                // first we save i which is the starting point
                // of the match
                ret = i;

                // need to end it here, otherwise,
                // we mess up i, and once set match to true
                // we never change it, so ret will always
                // increment to the current i
                break;
            }
        }

        // this is our final value, the first matching
        // index
        return ret;
    }


}
