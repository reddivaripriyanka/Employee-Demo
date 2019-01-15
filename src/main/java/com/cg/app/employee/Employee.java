package com.cg.app.employee;

public class Employee {
private String empName;
private double salary;
private int empId;
public Employee(int empId, String empName, double salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
}
public Employee() {
	
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", salary=" + salary + ", empId=" + empId + "]";
}
}
