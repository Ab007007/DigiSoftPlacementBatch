package java18.innerclasses;

public class StaticInnerClassDemo
{
	static int age = 25;
	static class Test {
		int a ;
		static void test1()
		{
			System.out.println("i'm from inner class static method " + age);
		}
		void test2()
		{
			System.out.println("i'm from inner class non-static method " + age);
		}
	}
	public static void main(String[] args)
	{
		
		Test t = new Test();
		t.test1();
		t.test2();
		
		StaticInnerClassDemo.Test.test1();
	}
	
}
