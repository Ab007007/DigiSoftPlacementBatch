package com.digisoft.traning.basics.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo
{
	
	public static void main(String[] args)
	{
		
		Map mp = new TreeMap();
		
		
		mp.put(4, "Aravinda");
		mp.put(5 , 55);
		mp.put(1, 5.8);
		mp.put(10, 74);
		
		
		System.out.println("Total elements in an array : " + mp.size());
		
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		Object key;
		while(it.hasNext())
		{
			key = it.next();
			System.out.println(key + " : " + mp.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
