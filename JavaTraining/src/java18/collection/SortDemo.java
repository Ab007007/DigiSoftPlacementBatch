package java18.collection;

import java.util.ArrayList;
import java.util.List;

public class SortDemo
{

	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(55);
		l.add(25);
		l.add(85);
		l.add(3);
		l.add(29);
		
		l.sort((a,b) -> a.compareTo(b));
//		l.sort((a,b) -> l.compare(a,b));
		l.forEach(item -> System.out.println(item));
		
		
		
	}
}
