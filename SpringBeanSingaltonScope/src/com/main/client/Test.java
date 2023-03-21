package com.main.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.main.client.model.Student;



public class Test {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("Bean.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Student s=(Student) bf.getBean("s");
		System.out.println(s);
		s.display();
		Student s1=(Student) bf.getBean("s");
		System.out.println(s1);
		s1.display();
		
	}

}
