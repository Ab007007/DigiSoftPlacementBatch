package com.digisoft.traning.basics.constructors;

public class Employee 
{
	public String employeeName;
	public String employeeID;
	public double salary;
	public String employeeEmailID;
	public String companyAddress;

	public Employee() {
		System.out.println("Default Constructor is called!!!");
	}
	public Employee(String empname, String empid, double salary, String empEmail,String addr)
	{
		System.out.println("Creating Object to Employee!!");
		this.employeeName = empname;
		this.employeeID = empid;
		this.salary = salary;
		this.employeeEmailID = empEmail;
		this.companyAddress = addr;
	}
	
}