package com.digisoft.traning.basics.constructors;

public class Employee 
{
	public String employeeName;
	public String employeeID;
	public double salary;
	public String employeeEmailID;
	public String companyAddress;

	
	@Override
	public String toString()
	{
		String banner = "\n-------------- Employee Information -----------------\n";
		String content = " Employee ame " + this.employeeName + "\n Employee ID : " +
		this.employeeID + "\n Employee Salary : " + this.salary + "\n Employee Email ID : " + 
			 this.employeeEmailID +	"\n Employee Work location : " + this.companyAddress;
		// TODO Auto-generated method stub
		return banner + content ;
	}
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