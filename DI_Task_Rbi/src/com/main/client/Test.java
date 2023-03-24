package com.main.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.model.Sbi;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
	     Sbi sbi=ap.getBean("sb",Sbi.class); 
		 System.out.println(sbi);
	}

}
