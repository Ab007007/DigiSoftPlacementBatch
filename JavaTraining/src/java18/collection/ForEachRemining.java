package java18.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachRemining
{
	public static void main(String[] args)
	{

		List<String> names = new ArrayList<String>();
		names.add("Aravind");
		names.add("Manoj");
		names.add("Karthik");
		names.add("Rahul");
		names.add("Ramesh");

		names.forEach((item) -> System.out.println(item));

		System.out.println("Printing using Iterator");

		Iterator<String> it = names.iterator();
		it.forEachRemaining((item) -> System.out.println(item));

		//names.removeIf((ele) -> ele.contains("Ra"));
		
//		names.removeIf(ele -> (ele.contains("Ra")?true:false));
		
		names.removeIf((ele) -> 
		{ 
			if(ele.contains("Ra"))
			{
				System.out.println("Element getting removed " + ele);
				return true;
			}else
				return false;
			
		});
		names.forEach((item) ->
		{
			System.out.println(item);
		});

	}
}
