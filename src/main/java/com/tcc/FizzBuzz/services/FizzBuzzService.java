package com.tcc.FizzBuzz.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class FizzBuzzService {

	    private static final String FIZZ = "Fizz";
	    private static final String BUZZ = "Buzz";
	    private static final String FIZZ_BUZZ = "FizzBuzz";

	 
	    // Generates the FizzBuzz sequence up until a given value.
	    
	    public List<String> generateStream(final int n) {
	        final List<String> result = new ArrayList<>();

	        for (int i = 1; i <= n; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	            	result.add(FIZZ_BUZZ);
	            } else if (i % 3 == 0) {
	            	result.add(FIZZ);
	            } else if (i % 5 == 0) {
	            	result.add(BUZZ);
	            } else {
	            	result.add(String.valueOf(i));
	            }
	        }
	        return result;
	    }

	}
