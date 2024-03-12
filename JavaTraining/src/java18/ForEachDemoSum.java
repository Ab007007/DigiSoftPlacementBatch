package java18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemoSum
{

	
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<>();
		
		al.add(12);
		al.add(25);
		al.add(254);
		al.add(255);
	
		al.forEach(new ListConsumerDemo());
	}
	
	
}

class ListConsumerDemo implements Consumer<Integer>
{
	static int sum ;
	@Override
	public void accept(Integer t)
	{
		sum = sum + t;
		System.out.println("Total sum of Elements " + sum);
		
	}
}

