package com.stackroute.prac4;

import com.stackroute.Prac4.Regular;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularTest {
    Regular rl;

    @Before
    public void setup()
    {
        //arrange
        rl = new Regular();
    }

    @After
    public void tearDown()
    {
        //arrange
        rl = null;
    }

    @Test
    public void regular_string_shouldreturnamatchedrexpression()
    {
        String str = "This is Harry.";
        String result=rl.regular_string_shouldreturnamatchedrexpression(str);
        String expected="true";
        assertEquals(expected,result);

    }

    @Test
    public void regular_string_shouldreturnamatchedrexpressionFailure()
    {
        String str = "This is Harry.";
        String result=rl.regular_string_shouldreturnamatchedrexpression(str);
        String expected="false";
        assertNotEquals(expected,result);
        assertNotNull("",result);

    }

}