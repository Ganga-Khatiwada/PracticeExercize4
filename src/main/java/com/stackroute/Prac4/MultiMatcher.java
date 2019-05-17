package com.stackroute.Prac4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiMatcher {
    /**
     *
     * Example to find out the multiple occurrences using Matcher methods.
     *
     * @return
     */
    public int[] occurrences_string_shouldreturncount(String str)
        {
            int m=0,n=1;
            int[] array=new int[6];
            String regex = "se";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            /*
             * Returns: true if, and only if, a subsequence of the input sequence
             * matches this matcher's pattern
             */
            while (matcher.find())
            {
                array[m]=matcher.start();
                m=m+2;
                array[n]=matcher.end();
                n=n+2;
            }
            return array;
        }
}
