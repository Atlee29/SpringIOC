package com.main.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.main.model.Student;



public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Bean.xml");
		Student s=(Student) ac.getBean("s");
		System.out.println(s);
		s.display();
		Student s1=(Student) ac.getBean("s");
		System.out.println(s1);
		s1.display();

	}

}
