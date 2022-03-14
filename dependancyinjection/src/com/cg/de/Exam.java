package com.cg.de;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student surya = context.getBean("surya",Student.class);
		surya.displayStudentInfo();
		
		Student sude = context.getBean("sude",Student.class);
		sude.displayStudentInfo();
 
	}

}
