package com.validation.test;

import com.validation.Validate;

public class TestClass {

	@Validate(step = 1)
	public void firstStep(String message){
		System.out.println(message);
	}
	
	@Validate(step = 2)
	public void secondStep(String message){
		System.out.println(message);
	}
	
	@Validate(step = 3)
	public void thirdStep(String message){
		System.out.println(message);
	}
	
	@Validate(step = 4)
	public void fourthStep(String message){
		System.out.println(message);
	}
	
}
