package com.digisoft.traning.basics.constructors;

public class EmployeeManager
{
	public static void main(String[] args) 
	{
		
		Employee e1 = new Employee();
		e1.employeeName = "Rakesh";
		e1.employeeID = "Emp123";
		e1.employeeEmailID = "rakesh123@ibmindia.com";
		e1.companyAddress = "Bangalore";
		e1.salary = 10000000;
		
		Employee e2 = new Employee("Mallikarjun", "emp1234", 12000000, "malikarjun@wipor.com", "Pune");
		Employee e3 = new Employee("Aravinda", "emp14", 8000000, "aravind@wipor.com", "Bangalore");
		Employee e4 = new Employee("Satwik", "emp234", 12000000, "satwik@wipor.com", "Hyderabad");
		Employee e5 = new Employee("Pallavi", "emp345", 18000000, "pallavi@wipor.com", "Pune");
		Employee e6 = new Employee("Sandeep", "emp34", 24000000, "sandeep@wipor.com", "Bangalore");
		
	}

}
