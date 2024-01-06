package com.digisoft.traning.basics.access.pack2;

import com.digisoft.traning.basics.access.pack1.A;

public class D extends A
{

	public static void main(String[] args) {
		D a = new D();
	//	System.out.println(a.privateMember);
	//	System.out.println(a.defaultMember);
		System.out.println(a.protectedMember);
		System.out.println(a.publicMember);
		
		
	//	a.test1();
	//	a.test2();
		a.test3();
		a.test4();
	
	
	}
	
}
