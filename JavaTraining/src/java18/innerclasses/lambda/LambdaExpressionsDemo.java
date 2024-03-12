package java18.innerclasses.lambda;

import java18.innerclasses.A;

public class LambdaExpressionsDemo 
{

	
		public static void main(String[] args)
		{
			A a1 = new A() {
				public void printName()
				{
					System.out.println("Annonymous inner class");

				}
			};
			
			A a = () -> System.out.println("Lambda Expressions");
			a.printName();
			
			
			B b = (name) -> System.out.println("User Name is " + name);
			b.printName("aravinda");
			
			C c = () -> 200;
			int num = c.printGivenNumber();
			System.out.println("Given Number : " + num);
			
			D d = (name, age) ->
			{
				String userinfo = null;
				userinfo = "User Name : " + name + " and age is " + age;
				return userinfo;
			};
			System.out.println(d.PrintUserInfo("aravind", 36));
		}
	
	
}
