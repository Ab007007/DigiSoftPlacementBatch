package java18.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(25);
		al.add(35);
		al.add(45);
		al.add(5);
		al.add(15);
		al.add(12);
		al.add(10);
		al.add(22);
		al.add(21);
		al.add(2);
		
	//	al.forEach(System.out :: println);
		
		
		Stream<Integer> stream = al.stream();
		
		stream.forEach(System.out :: println);
		
	}
}
