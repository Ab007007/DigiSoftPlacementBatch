package com.digisoft.traning.basics.wrapper;

import java.util.Random;

public class WrapperClassesDemo
{

	public static void main(String[] args)
	{
		
		int a = 5;
		String age = "40";
		
		//Boxing - converting from primitive data type to derived data type
		Integer aObj = Integer.valueOf(a);
		
		Integer ageObj = Integer.valueOf(age);
		
		
		//Unboxing - converting from derived data type to primitive data type
		
		int agePD = Integer.parseInt(age);
		
		int aPD = Integer.parseInt(String.valueOf(aObj));
		
		System.out.println("a " + a);
		System.out.println("age " + age);
		System.out.println("aObj " + aObj);
		System.out.println("ageObj " + ageObj);
		System.out.println("agePD " + agePD);
		System.out.println("aPD " + aPD);
		
		
		Double ageDouble = Double.valueOf(age);
		System.out.println("ageDouble" + ageDouble);
		int max = 400, min = 200;
		System.out.println((int)(Math.random()*(max-min +1) + min));
		System.out.println((int)(Math.random()*(max-min +1) + min));
		System.out.println((int)(Math.random()*(max-min +1) + min));
		
		Random rd = new Random();
		System.out.println(rd.nextInt(1000));

	}
}
