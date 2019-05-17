package com.stackroute.Prac4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    /**
     * Find out if a String contains a very simple pattern.
     * @return
     */
    public String regular_string_shouldreturnamatchedrexpression(String str)
    {
        Pattern p = Pattern.compile("Harry");   // the pattern to search for
        Matcher m = p.matcher(str);

        // now try to find at least one match
        if (m.find())
            return String.valueOf(true);
        else
            return String.valueOf(false);
    }
}