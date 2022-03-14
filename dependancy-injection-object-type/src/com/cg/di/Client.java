package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("beans.xml file loaded");
		Student student = context.getBean("stu",Student.class);
		student.Cheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherStudent",AnotherStudent.class);
		anotherStudent.startCheating();
	}

}
