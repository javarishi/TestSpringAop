package com.learn.spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-aop.xml");
		
		TestAopBean testAop = context.getBean("testAop", TestAopBean.class);
		try {
			System.out.println("Printing Test Variable : " + testAop.getTestVariable());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		context.close();

	}

}
