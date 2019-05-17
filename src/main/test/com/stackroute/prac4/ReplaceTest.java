package com.stackroute.prac4;

import com.stackroute.Prac4.Replace;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {

    Replace rp;

    @Before
    public void setup() {
        //arrange
        rp = new Replace();
    }

    @After
    public void tearDown() {
        //arrange
        rp = null;
    }

    @Test
    public void replaceElements_string_shouldreturnreplacedstring()
    {
        String str="daily dry";
        String result=rp.replaceElements_string_shouldreturnreplacedstring(str);
        String expected="faity fry";
        assertEquals(expected,result);
    }

    @Test
    public void replaceElements_string_shouldreturnreplacedstringFailure()
    {
        String str="daily dry";
        String result=rp.replaceElements_string_shouldreturnreplacedstring(str);
        String expected="faily fry";
        assertNotEquals(expected,result);
        assertNotNull("",result);
    }
}
