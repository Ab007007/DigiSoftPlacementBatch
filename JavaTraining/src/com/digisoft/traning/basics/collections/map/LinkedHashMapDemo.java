package com.digisoft.traning.basics.collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo
{
	
	public static void main(String[] args)
	{
		
		Map mp = new LinkedHashMap();
		
		
		mp.put("name", "Aravinda");
		mp.put("age", 55);
		mp.put("height", 5.8);
		mp.put("weight", 74);
		
		
		System.out.println("Total elements in an array : " + mp.size());
		
		System.out.println(mp.get("name"));
		
		
		if(mp.containsKey("name"))
			System.out.println("Key already present");
		else
			mp.put("name", "Aravinda-123");
		
		System.out.println(mp.get("name"));
		
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
