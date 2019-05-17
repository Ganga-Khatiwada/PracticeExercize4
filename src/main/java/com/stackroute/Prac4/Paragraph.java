package com.stackroute.Prac4;
import java.util.*;

public class Paragraph {

    public String[] extract_string_shouldreturnsortedwords(String str){
                String[] words=str.split(" ");
                int n=words.length;
                String temp="";

                for (int i = 0; i < n; i++)
                {
                    for (int j = i + 1; j < n; j++)
                    {
                        if (words[i].compareTo(words[j])>0)
                        {
                            temp = words[i];
                            words[i] = words[j];
                            words[j] = temp;
                        }
                    }
                }
                return words;
    }
}
