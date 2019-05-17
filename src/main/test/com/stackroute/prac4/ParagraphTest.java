package com.stackroute.prac4;

import com.stackroute.Prac4.Paragraph;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphTest {

    Paragraph pr;

    @Before
    public void setup() {
        //arrange
        pr = new Paragraph();
    }

    @After
    public void tearDown() {
        //arrange
        pr = null;
    }

    @Test
    public void extract_string_shouldreturnsortedwords()
    {
        String str = "i stay here at kormangala";
        String[] expected = {"at","here","i","kormangala","stay"};
        String[] result = pr.extract_string_shouldreturnsortedwords(str);
        assertArrayEquals(expected, result);
    }

    @Test
    public void extract_string_shouldreturnsortedwordsFailure()
    {
        String str = "i stay here at kormangala";
        String[] expected = {"at","i","stay","kormangala","here"};
        String[] result = pr.extract_string_shouldreturnsortedwords(str);
        assertNotEquals(expected, result);
    }
}
