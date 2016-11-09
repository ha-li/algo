package com.gecko.string.matcher;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hlieu on 11/8/16.
 */
// an example of string matching by hashmap
// O(template.length) run time
public class StringMatchMap implements StringMatch {



    public int match(String template, String pattern) {
        Map<String, Integer> stringMap = new HashMap<String, Integer>();

        int t = template.length();
        int p = pattern.length();

        // we construct each possible substring of the
        // same length as the template
        // and we store it in a hash map,
        // with substring as key, and index as value
        for( int i = 0; i < t - p; i++ ) {
            String sub = template.substring(i, i + p);
            stringMap.put(sub, i);
        }

        // then we retrieve the pattern
        // and if we get null, there was no match, so return -1
        // otherwise we get back the index of the match
        // and we return that
        Integer ret = stringMap.get(pattern);
        return (ret == null) ? -1 : ret;
    }
}
