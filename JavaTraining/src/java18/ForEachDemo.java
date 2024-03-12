package java18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo
{

	
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<>();
		
		al.add(12);
		al.add(25);
		al.add(254);
		al.add(255);
	
		System.out.println("For Each Demo using Class");
		al.forEach(new ListConsumer());
		
		System.out.println("For Each Demo using Annonymous Inner Class");
		al.forEach(new Consumer() {
			
			@Override
			public void accept(Object t)
			{
				System.out.println("Annonymous Inner Class :: " + t);
				
			}
		});
		
		System.out.println("For Each Demo using Lambda Expression");
		al.forEach((num)-> System.out.println("Lambda Expression -->" + num));
	}
	
	
}

class ListConsumer implements Consumer<Integer>
{
	@Override
	public void accept(Integer t)
	{
		System.out.println("consuming :: " + t);
		
	}
}

