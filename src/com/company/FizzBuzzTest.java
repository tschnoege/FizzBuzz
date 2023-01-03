package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testCheckFizz() {

        assertFalse(FizzBuzz.checkFizz(1));
        assertTrue(FizzBuzz.checkFizz(3));
        assertTrue(FizzBuzz.checkFizz(123));
    }

    @Test
    public void testCheckBuzz() {
        assertFalse(FizzBuzz.checkBuzz(1));
        assertTrue(FizzBuzz.checkBuzz(5));
        assertTrue(FizzBuzz.checkBuzz(125));
    }

    @Test
    public void testGet() {
        assertEquals("1", FizzBuzz.get(1));
        assertEquals("Fizz", FizzBuzz.get(3));
        assertEquals("Buzz", FizzBuzz.get(5));
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }
}