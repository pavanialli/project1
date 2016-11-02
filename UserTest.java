package com.niit.online.onlinebooksbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.online.onlinebooksbackend.model.User;

public class UserTest {

	
static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        context = new AnnotationConfigApplicationContext();
        context.scan("com.niit");
        context.refresh();
        User user=(User)context.getBean("user");
        System.out.println("User create");
	}

}
