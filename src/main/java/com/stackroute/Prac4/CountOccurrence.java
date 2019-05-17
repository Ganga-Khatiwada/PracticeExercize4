package com.stackroute.Prac4;

public class CountOccurrence {

    public int count_string_shouldreturnoccurrence(String str){
        int n;
        n= str.length();
        int charcount = str.length() - str.replaceAll("a", "").length();
        return charcount;
    }

}
