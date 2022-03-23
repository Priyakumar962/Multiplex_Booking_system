package com.beans;
import java.util.*;

public class Employee {
private String employee_name;
private int id;
private Employee_details employee_details;

public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee[id="+ id +",name="+ employee_name +"]";
}

}
