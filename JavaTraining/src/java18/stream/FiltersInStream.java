package java18.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltersInStream
{
	public static <T> void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(25);
		al.add(35);
		al.add(45);
		al.add(45);
		al.add(45);
		al.add(5);
		al.add(15);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(10);
		al.add(22);
		al.add(22);
		al.add(22);
		al.add(21);
		al.add(2);
		
		Stream<Integer> stream = al.stream();
		
		stream.forEach(System.out :: println);
		
		Stream<Integer> streamNew = al.stream();
		
		
		System.out.println("Filter using Predicte ");
		List<Integer> elementesGreaterThan18 = streamNew.filter(new Predicate<Integer>()
		{

			@Override
			public boolean test(Integer num)
			{
				
				return num>18;
			}
		}).collect(Collectors.toList());
		
		System.out.println("Printing Elements greter than 18");
		elementesGreaterThan18.forEach(System.out :: println);
		
		Stream<Integer> lambdaStream = al.stream();
		
		List<Integer> lambdaListGreaterThan18 = lambdaStream.filter(num -> (num > 18)).collect(Collectors.toList());
		
		System.out.println("Printing Elements greter than 18 Using Lambda");
		lambdaListGreaterThan18.forEach(System.out :: println);
		
		
		Stream<Integer> oddNumberStream = al.stream();
		List<Integer> lambdaListOddNumbers = oddNumberStream.filter(num -> (num % 2 !=0)).collect(Collectors.toList());
		System.out.println("Print Odd Numbers using Lambda");
		lambdaListOddNumbers.forEach(System.out :: println);
		
		Stream<Integer> evenNumberStream = al.stream();
		List<Integer> lambdaListEvenNumbers = evenNumberStream.filter(num -> (num % 2 ==0)).collect(Collectors.toList());
		System.out.println("Print Even Numbers using Lambda");
		lambdaListEvenNumbers.forEach(System.out :: println);
		
		
		Stream<Integer> firstGreaterNumberStream = al.stream();
		Optional<Integer> firstNumber = firstGreaterNumberStream.filter(num -> (num > 18)).findFirst(); 
		System.out.println("Print First Number Greter than 18 using Lambda : " + firstNumber);
		
		
		System.out.println("Find the greater number in the List");
		Stream<Integer> greaterNumberSTream = al.stream();
		
		Optional<Integer> num = greaterNumberSTream.max(new Comparator<Integer>()
		{

			@Override
			public int compare(Integer o1, Integer o2)
			{
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
		System.out.println("Max number is " + num);
		
		Stream<Integer> greaterNumberUsingLmbda = al.stream();
		
		Optional<Integer> numUsingLambda = greaterNumberUsingLmbda.max((num1,num2) -> num1.compareTo(num2));
		
		System.out.println("Max number Using Lmbda " + numUsingLambda);
		
		System.out.println("Find the Min number in the List");
		Stream<Integer> minNumberUsingLmbda = al.stream();
		
		Optional<Integer> minusingLambda = minNumberUsingLmbda.min((num1,num2) -> num1.compareTo(num2));
		
		System.out.println("Min number Using Lmbda " + minusingLambda);
		
		stream.close();
		
		System.out.println("Unique elements in collection");
		stream = al.stream();
		Stream<Integer> uniqueElements = stream.distinct();
		uniqueElements.forEach(System.out :: println);
	}
}
