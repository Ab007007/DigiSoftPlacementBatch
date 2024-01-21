package com.digisoft.traning.basics.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo
{
	
	public static void main(String[] args)
	{
		Set s = new LinkedHashSet();
		
		s.add(555);
		s.add(55);
		s.add(5);
		s.add(50);
		s.add(5555);

		System.out.println("Totl number of elements in a  Set : " + s.size());
	
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	
	
	}

}
