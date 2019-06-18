package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDempApp {
	
	public static void main(String[] args) {
		
		//Create container and load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Check too see if the above beans are the same
		//They both have the default scope since in config file 
		//no scope is specified for them
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		//print out the memory location for each of the above beans
		System.out.println("\nMemory location for the coach: " + theCoach);
		
		System.out.println("\nMemory location for the coach" + alphaCoach + "\n");
		
		//Close the context
		context.close();
	}

}
