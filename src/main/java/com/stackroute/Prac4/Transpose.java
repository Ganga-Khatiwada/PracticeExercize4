package com.stackroute.Prac4;

public class Transpose {

    public String reverseWord_string_shouldreturnreversestring(String str)
    {
        /* The split() method of String class splits
         * a string in several strings based on the
         * delimiter passed as an argument to it
         */
        String[] words = str.split(" ");
        String revString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String revWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                /* The charAt() function returns the character
                 * at the given position in a string
                 */
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
        return revString;
    }
}
