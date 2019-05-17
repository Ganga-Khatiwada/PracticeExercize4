package com.stackroute.prac4;

import com.stackroute.Prac4.MultiMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MultiMatcherTest {

        MultiMatcher mm;

        @Before
        public void setup() {
            //arrange
            mm = new MultiMatcher();
        }

        @After
        public void tearDown() {
            //arrange
            mm = null;
        }

        @Test
        public void occurrences_string_shouldreturncount()
        {
            String str = "She sells seashells by the seashore";
            int[] expected={4,6,10,12,27,29};
            int[] actual=mm.occurrences_string_shouldreturncount(str);
            assertArrayEquals(expected,actual);
            int i =0;
            while (i<6){
                System.out.println("Found at: "+actual[i]+"-" + actual[i+1]);
                i=i+2;
            }
        }
}
