package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource; 

//
//
//import com.beans.Customer; 
//public class SpringClient { 
//
//public static void main(String[] args) { 
//
//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml")); 
//Customer cust = (Customer) factory.getBean("cust"); 
//System.out.println(cust); 
//
//} 
//
//} 
import com.beans.Employee;
import com.beans.Employee_details;
public class SpringClient {
	 


	public static void main(String[] args) { 

	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml")); 
	Employee emp = (Employee) factory.getBean("emp"); 
	System.out.println(emp); 
	Employee_details empd = (Employee_details) factory.getBean("empd"); 
	System.out.println(empd); 
	} 

	} 

