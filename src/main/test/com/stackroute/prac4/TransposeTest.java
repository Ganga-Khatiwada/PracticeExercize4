package com.stackroute.prac4;

import com.stackroute.Prac4.Transpose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TransposeTest {

    Transpose tr;

    @Before
    public void setup() {
        //arrange
        tr = new Transpose();
    }

    @After
    public void tearDown() {
        //arrange
        tr = null;
    }

    @Test
    public void reverseWord_string_shouldreturnreversestring()
    {
        String str="My name is ganga";
        String result=tr.reverseWord_string_shouldreturnreversestring(str);
        String expected="yM eman si agnag ";
        assertEquals(expected,result);

    }

    @Test
    public void reverseWord_string_shouldreturnreversestringFailure()
    {
        String str="My name is ganga";
        String result=tr.reverseWord_string_shouldreturnreversestring(str);
        String expected="yM emna si angag ";
        assertNotEquals(expected,result);
        assertNotNull("",result);

    }

}
