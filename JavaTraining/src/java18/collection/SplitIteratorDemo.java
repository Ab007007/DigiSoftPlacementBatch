package java18.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorDemo
{

	
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 250; i++)
		{
			al.add(i+1);
		}
		
		Spliterator<Integer> it = al.spliterator();
		Spliterator<Integer> childIt = it.trySplit();
		
		it.forEachRemaining((ele) -> System.out.println(ele));
	
		System.out.println("Second set");
	
		childIt.forEachRemaining(ele -> System.out.println(ele));
	}
}
