package com.Methods.Labs.Tests;
import com.Methods.Labs.MethodsLab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MethodsLabTests {
    MethodsLab a = new MethodsLab();

    @Test
    void maxOfTwoNumbersTest(){
        Assertions.assertEquals(20.58, a.maxOfTwoNumbers(10.23, 20.58));
    }

    @Test
    void maxOfThreeTest() {
        Assertions.assertEquals(32.78, a.maxOfThree(23.32, 32.78, 25.33));
    }

    @Test
    void isCharacterAVowelTest() {
        Assertions.assertEquals(true, a.isCharacterAVowel('A'));
        Assertions.assertFalse(a.isCharacterAVowel('d') );
    }

    @Test
    void numOfArgumentsTest() {
        Assertions.assertEquals(3, a.numOfArguments("hello", "test", "why"));
    }

    @Test
    void reverseStringTest() {
        Assertions.assertEquals("dlrow olleh", a.reverseString("hello world"));
    }

    @Test
    void findLongestWordTest() {
        String [] b = {"hello", "today", "tomorrow", "christmas"};
        Assertions.assertEquals("christmas", a.findLongestWord(b));
    }

    @Test
    void filterMoreLongWordsTest() {
        String [] b = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int c = 7;

        List<String> d = new ArrayList<String>();
        d.add("Wednesday");
        d.add("Thursday");
        d.add("Saturday");

        Assertions.assertEquals(d, a.filterMoreLongWords(b, c));

    }
}

