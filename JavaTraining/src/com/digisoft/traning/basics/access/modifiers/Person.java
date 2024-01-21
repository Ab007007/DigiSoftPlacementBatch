package com.digisoft.traning.basics.access.modifiers;

public class Person {

	public String name;
	public int age;
	public double weight;
	public double height;
	public static final String country = "India";
	public static final int MAX_AGE = 100;

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		System.out.println("Name " + this.name);
		System.out.println("Age " + this.age);
		System.out.println("Height " + this.weight);
		System.out.println("Weight" + this.height);
		System.out.println("Country " + this.country);
		System.out.println("Max Age " + this.MAX_AGE);
		return "";
	}
	
	void printObjValues() {
		
		System.out.println("Name " + this.name);
		System.out.println("Age " + this.age);
		System.out.println("Height " + this.weight);
		System.out.println("Weight" + this.height);
		System.out.println("Country " + this.country);
		System.out.println("Max Age " + this.MAX_AGE);
	}
	
	
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.name = "Aravinda";
		p.age = 35;
		p.height = 5.8;
		p.weight = 74;
		
		
		Person p2 = new Person();
		p2.name = "Satwik";
		p2.age = 35;
		p2.height = 5.8;
		p2.weight = 74;
		
		System.out.println(p);
		System.out.println(p2);
		//p.printObjValues();
		//p2.printObjValues();
	}
}