package java18.innerclasses;

public class LocalInnerClass
{

	public static void main(String[] args)
	{
		
		class Person {
			String name ;
			int age;
			
			public Person()
			{
				// TODO Auto-generated constructor stub
			}
			
			public Person(String nme, int age)
			{
				this.name = nme;
				this.age = age;
				System.out.println("Person name and age " + nme + " : " + age);
			}
			

		}
		
		Person p1 = new Person("aravind" , 36);
		
	}
}
