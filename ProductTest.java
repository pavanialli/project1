package com.niit.online.onlinebooksbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.online.onlinebooksbackend.model.Product;
import com.niit.online.onlinebooksbackend.model.User;

public class ProductTest {

	static AnnotationConfigApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new AnnotationConfigApplicationContext();
        context.scan("com.niit");
        context.refresh();
        Product product=(Product)context.getBean("product");
        System.out.println("Product create");

	}

}
