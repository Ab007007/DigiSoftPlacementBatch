package java18.innerclasses.lambda;

import java18.innerclasses.A;

public class LambdaMoreLines 
{

	
		public static void main(String[] args)
		{
			A a1 = new A() {
				public void printName()
				{
					System.out.println("Annonymous inner class");

				}
			};
			
			
			A a = () -> 
			{
				System.out.println("--------------------");
				System.out.println("Lambda Expressions");
				System.out.println("------------------------");
			};
			
			a.printName();
		}
	
	
}
