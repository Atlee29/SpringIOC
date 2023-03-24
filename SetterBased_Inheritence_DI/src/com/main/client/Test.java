package com.main.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.model.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		Product pt=ap.getBean("p",Product.class);
		System.out.println(pt);
	}

}
