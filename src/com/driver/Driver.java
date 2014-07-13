package com.driver;

import java.lang.reflect.Method;

import com.validation.Validate;
import com.validation.test.TestClass;

public class Driver {

	public static void validationInvoker(){
		
		try {
			Method [] methods = Class.forName(TestClass.class.getName()).getMethods();
			
			for (int i = 0; i < methods.length; i++) {
				Validate invokeMultiple = methods[i].getAnnotation(Validate.class);
				if(invokeMultiple != null){
					int validationNum = invokeMultiple.step();
					for (int j = 0; j < validationNum; j++) {
						methods[i].invoke("I am validation "+validationNum);
					}
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		validationInvoker();

	}

}
