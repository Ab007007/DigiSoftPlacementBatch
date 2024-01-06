package com.digisoft.traning.basics.access.pack1;

public class A {

	private int privateMember = 10;
	int defaultMember = 20;
	protected int protectedMember = 30;
	public int  publicMember = 40;
	
	
	
	private void test1()
	{
		System.out.println(privateMember);
		System.out.println(defaultMember);
		System.out.println(protectedMember);
		System.out.println(publicMember);
	}
	
	void test2()
	{
		System.out.println(privateMember);
		System.out.println(defaultMember);
		System.out.println(protectedMember);
		System.out.println(publicMember);
	}
	
	protected void test3()
	{
		System.out.println(privateMember);
		System.out.println(defaultMember);
		System.out.println(protectedMember);
		System.out.println(publicMember);
	}
	

	public  void test4()
	{
		System.out.println(privateMember);
		System.out.println(defaultMember);
		System.out.println(protectedMember);
		System.out.println(publicMember);
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.privateMember);
		System.out.println(a.defaultMember);
		System.out.println(a.protectedMember);
		System.out.println(a.publicMember);
		
		
		a.test1();
		a.test2();
		a.test3();
		a.test4();
	
	
	}
	
	
	
	
	
}
