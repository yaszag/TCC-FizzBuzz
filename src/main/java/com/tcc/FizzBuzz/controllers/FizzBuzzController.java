package com.tcc.FizzBuzz.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.FizzBuzz.entity.FizzBuzz;
import com.tcc.FizzBuzz.services.FizzBuzzService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping(value = "/api/FizzBuzz/")

@Api(value = "FizzBuzz System")
public class FizzBuzzController {
	
	 private FizzBuzzService fizzBuzzService;
	    private static final String ERROR_MESSAGE =
	            "Invalid request, you have to enter a valid number greater than 0!";

	    @Autowired
	    FizzBuzzController(final FizzBuzzService fizzBuzzService) {
	        this.fizzBuzzService = fizzBuzzService;
	    }

	    //Returns the Last FizzBuzz result.
	    @ApiOperation(value = "Get FizzBuzz")
	    @GetMapping(value = "{number}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<FizzBuzz> getStream(@PathVariable(value = "number") final int number) {
	        final FizzBuzz fizzBuzz = new FizzBuzz();

	        if (number < 1) {
	            fizzBuzz.setMessage(ERROR_MESSAGE);
	            return new ResponseEntity<>(fizzBuzz, HttpStatus.BAD_REQUEST);
	        }

	        final List<String> result = fizzBuzzService.generateStream(number);
	        fizzBuzz.setResult(result);

	        return new ResponseEntity<>(fizzBuzz, HttpStatus.OK);
	    }

	 
}
