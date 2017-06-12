package com.foxy.Foxyspringbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanTestcase {
	public static void main(String[] args) 
	{
		System.out.println("--Test case- AnnotationConfigApplication created--");
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		System.out.println("Scan method called");
		context.scan("com.foxy.Foxyspringbackend");
		
		
		System.out.println("Refresh Method Called");
		context.refresh();
		
		
		System.out.println("my bean created");
		MyBean myBean=(MyBean)context.getBean("myBean");
		myBean.display();
	}

}
