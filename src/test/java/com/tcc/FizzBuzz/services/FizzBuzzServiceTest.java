package com.tcc.FizzBuzz.services;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzServiceTest {

    private final FizzBuzzService fizzBuzzService = new FizzBuzzService();

    @Test
    void testGenerateFizzBuzzSequence() {
        final int number = 20;
        final List<String> result = fizzBuzzService.generateStream(number);
        assertArrayEquals(
                new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                        "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" }, result.toArray());
        assertTrue(result.get(2).equals("Fizz"));
        assertTrue(result.get(4).equals("Buzz"));
        assertTrue(result.get(14).equals("FizzBuzz"));
        assertEquals(number, result.size());
    }

    @Test
    void testGenerateFizzBuzzSequenceInvalidInput() {
        final int number = 0;
        final List<String> result = fizzBuzzService.generateStream(number);
        assertTrue(result.isEmpty());
    }
}
