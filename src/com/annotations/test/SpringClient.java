package com.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotations.Student;

//import classes.College;

public class SpringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
		Student stu = (Student) context.getBean("student");
//		College c =(College) context.getBean("College");
//		custom.Class cls = (custom.Class) context.getBean("class");
		System.out.println(stu);
//		System.out.println(c);
//		System.out.println(cls);
//		
//		StudentService service = (StudentService) context.getBean("studentService");
//		System.out.println(service.setStudentDetails(100, "Sameer"));
	}

}
