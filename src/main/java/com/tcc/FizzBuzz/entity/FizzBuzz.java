package com.tcc.FizzBuzz.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

public class FizzBuzz {
	
	
	 	@JsonInclude(JsonInclude.Include.NON_NULL)
	    private List<String> result;

	    @JsonInclude(JsonInclude.Include.NON_NULL)
	    private String message;

	    public List<String> getResult() {
	        return result;
	    }

	    public void setResult(final List<String> result) {
	        this.result = result;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(final String message) {
	        this.message = message;
	    }
}
