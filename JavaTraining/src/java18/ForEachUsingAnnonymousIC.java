package java18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachUsingAnnonymousIC
{

	
	public static void main(String[] args)
	{
		List<Object> al = new ArrayList<>();
		
		al.add(12);
		al.add(25);
		al.add(254);
		al.add(255);
		al.add("sdfsdf");
	
		al.forEach(new Consumer() {
			
			@Override
			public void accept(Object t)
			{
				System.out.println("consuming :: " + t);
				
			}
		});
	}
	
	
}



