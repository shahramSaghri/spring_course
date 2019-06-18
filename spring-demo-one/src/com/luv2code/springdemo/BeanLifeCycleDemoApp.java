package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.logging.Logger;

public class BeanLifeCycleDemoApp {
	 
	private final static Logger LOGGER = 
			Logger.getLogger(BeanLifeCycleDemoApp.class.getName());
	
	
	public static void main(String[] args) {
		
		
		
		//Create the container and load the xml configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//Retrieve the bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Close the context
		context.close();
	}

}
