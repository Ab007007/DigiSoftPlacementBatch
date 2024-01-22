package com.digisoft.traning.basics.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.digisoft.traning.basics.constructors.Employee;


public class ArrayListUsingGenerics
{
	public static void main(String[] args)
	{
		
		List<Employee> al = new ArrayList<Employee>();
		//adding element to collection

		al.add(new Employee("employee-1", "emp-123", 11212, "emp1@abc.com", "Bangalore"));
		al.add(new Employee("employee-2", "emp-122", 221212, "emp2@abc.com", "Bangalore"));
		al.add(new Employee("employee-3", "emp-121", 21212, "emp3@abc.com", "Bangalore"));
		al.add(new Employee("employee-4", "emp-124", 121212, "emp4@abc.com", "Bangalore"));
		al.add(new Employee("employee-5", "emp-125", 321212, "emp5@abc.com", "Bangalore"));
		al.add(new Employee("employee-6", "emp-126", 421212, "emp6@abc.com", "Bangalore"));

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
