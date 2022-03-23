package com.beans;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource; 



//import com.beans.Employee;
//public class Employee_details {
//	 
//
//
//	public static void main(String[] args) { 
//
//	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml")); 
//	Employee emp = (Employee) factory.getBean("emp"); 
//	System.out.println(emp); 
//	} 
//
//	} 
import java.util.*;
public class Employee_details{
private List<String> location;

@Override
public String toString() {
	return "Employee_details [location=" + location + "]";
}

public List<String> getLocation() {
	return location;
}

public void setLocation(List<String> location) {
	this.location = location;
}
//@Override
//public String toString() {
//	return "Employee_details[location="+ location+ "]";
//}
}