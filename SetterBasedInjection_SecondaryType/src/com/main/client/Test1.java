package com.main.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.model.Account;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean2.xml");
		Account acc=a.getBean("ac",Account.class);
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getAhname());
		System.out.println(acc.getBranchId());
		System.out.println(acc.getBname());
	}
}
