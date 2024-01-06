package com.digisoft.traning.basics.methods;

public class MethodsDemo {

	
	// [access specifier] [access modifier] return_type nameofMethod([arguments])
//	{
		
		
//	}
	
	int sum(int a , int b)
	{
		int c = a + b;
		System.out.println("The sum of two numbers is " + c);
		return c;
	}
	
	double sum(double d1, double d2) {
		double d = d1 + d2;
		System.out.println("The sum of two numbers is " + d);
		return d;
	}
	
	String sum(String s1, String s2) {
		String fullName = s1 + s2;
		System.out.println("The sum of two numbers is " + fullName);
		return fullName;
	}
	
	
	
	public static void main(String[] args) {
		
		MethodsDemo md = new MethodsDemo();
		int d = md.sum(55, 55);
		int e = md.sum(d,d);
		
		md.sum(55.55, 66.66);
		md.sum("Aravinda", " HB ");
		
		md.sum(55.5, 10);
		
		
		
		
		
	}
	
}
