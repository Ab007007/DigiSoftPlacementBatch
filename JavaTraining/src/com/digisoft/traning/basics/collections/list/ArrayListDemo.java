package com.digisoft.traning.basics.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		
		List al = new ArrayList();
		
		//adding element to collection
		al.add("Aravinda");
		al.add(40);
		al.add(5.8);
	//	al.add(new Person());
		
		System.out.println("Total Elements Present in Collection : " + al.size());
		System.out.println(al.get(0));
		printCollection(al);
		
		//adding element on a specific index
		al.add(0, "New Iteam");
		printCollection(al);
		System.out.println("Contains Element >>> ??? " + al.contains("Aravinda"));

		//removing element at a specific index
		al.remove(0);
		printCollection(al);
		printElementsUsingForEach(al);
		printElementsUsingIterator(al);
	}

	private static void printElementsUsingIterator(List al)
	{
		System.out.println("--- Prinitng Elements using iterator ---");
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	private static void printElementsUsingForEach(List al)
	{
		System.out.println("--- Printing Elements using ForEach loop");
		for (Object object : al)
		{
			System.out.println(object);
		}
	}

	private static void printCollection(List al)
	{
		System.out.println("------------------ Printing Collection Elements ------------");
		for(int i=0; i<al.size(); i++)
		{
			System.out.println("Element at index " + i + " is : " + al.get(i));
		}
		
		System.out.println("------------------ Printing Collection Elements Ended ------------");
		
	}
}
