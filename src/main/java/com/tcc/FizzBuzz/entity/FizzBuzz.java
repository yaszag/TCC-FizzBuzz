package com.tcc.FizzBuzz.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All details about FizzBuzz. ")

public class FizzBuzz {
	
		@ApiModelProperty(notes = "FizzBuzz result. ")
	 	@JsonInclude(JsonInclude.Include.NON_NULL)
	 	
	    private List<String> result;

		@ApiModelProperty(notes = "FizzBuzz message. ")
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
