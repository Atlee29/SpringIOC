package com.main.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.model.Student;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		Student s=ap.getBean("s",Student.class);
		System.out.println(s);
		
	}

}
