package java18.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream
{

	public static void main(String[] args)
	{
		
		int[] marks = {55,65,69,74,77,108};
		
		IntStream streamObj = Arrays.stream(marks);
		
		System.out.println(streamObj.max());
		streamObj.close();
		streamObj = Arrays.stream(marks);
		
		System.out.println(streamObj.min());
		streamObj.close();
		streamObj = Arrays.stream(marks);
		
		System.out.println(streamObj.average());
		streamObj.close();
		streamObj = Arrays.stream(marks);
		
		streamObj.forEach(System.out :: println);
		streamObj.close();
		streamObj = Arrays.stream(marks);
		
	}
}
