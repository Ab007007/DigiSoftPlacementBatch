package com.digisoft.traning.basics.threads;

public class PrintOddAndEvenNumbers
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.out.println("---- Printing numbers from 1-100");
		for (int i = 1; i < 100; i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		printOddNumbers();
		printEvenNumbers();
	}

	public static void printOddNumbers()
	{
		System.out.println("printing Odd Number from 1-100");
		for (int i = 1; i < 100; i=i+2)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
//			try
//			{
//				Thread.sleep(1000);
//			} catch (InterruptedException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	
	public static void printEvenNumbers()
	{
		System.out.println("printing Even Number from 1-100");
		for (int i = 2; i < 100; i=i+2)
		{
			//System.out.println(i);

			System.out.println(Thread.currentThread().getName() + " : " + i);
			
//			try
//			{
//				Thread.sleep(1000);
//			} catch (InterruptedException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
