package com.stackroute.prac4;

import com.stackroute.Prac4.CountOccurrence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurrenceTest {

    CountOccurrence co;

    @Before
    public void setup() {
        //arrange
        co = new CountOccurrence();
    }

    @After
    public void tearDown() {
        //arrange
        co = null;
    }

    @Test
    public void count_string_shouldreturnoccurrence()
    {
        String str="Java is java again java again count number of occurrence of a in the given string";
        int result=co.count_string_shouldreturnoccurrence(str);
        int expected=11;
        assertEquals(expected,result);
    }

    @Test
    public void count_string_shouldreturnoccurrenceFailure()
    {
        String str="Java is java again java again count number of occurrence of a in the given string";
        int result=co.count_string_shouldreturnoccurrence(str);
        int expected=9;
        assertNotEquals(expected,result);
    }

}
