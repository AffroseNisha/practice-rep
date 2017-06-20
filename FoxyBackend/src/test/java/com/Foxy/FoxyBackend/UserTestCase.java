package com.Foxy.FoxyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Foxy.FoxyBackend.dao.CategoryDAO;
import com.Foxy.FoxyBackend.dao.UserDAO;
import com.Foxy.FoxyBackend.model.Category;
import com.Foxy.FoxyBackend.model.User;

public class UserTestCase {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.Foxy.FoxyBackend");
		
		context.refresh();
		
		// Inserting a Category Object.
		UserDAO userDAO=(UserDAO)context.getBean("UserDAO");
		
		
		User user=new User();
		user.setAddress("Mumbai");
		user.setCustName("banu");
		user.setEmail("asd@gmail");
		user.setMobile("1234567890");
		user.setPassWord("user1");
		user.setRole("salesman");
		user.setUserName("Fathima");
		
		userDAO.insertUpdateUser(user);
		
System.out.println("user inserted");
		
	
	
}
}
