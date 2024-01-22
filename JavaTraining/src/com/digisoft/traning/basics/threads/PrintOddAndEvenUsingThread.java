package com.digisoft.traning.basics.threads;

public class PrintOddAndEvenUsingThread
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Demon " + Thread.currentThread().isDaemon());
		System.out.println("---- Printing numbers from 1-100");
		PrintOddNumbers pod = new PrintOddNumbers();
		PrintEvenNumbers pev = new PrintEvenNumbers();
		
		pod.setName("[ PrintOddNumbers ] : ");
		pev.setName("[PrintEvenNumbers ] : ");
		
		pod.setPriority(Thread.MAX_PRIORITY);
		pod.start();
		pev.start();
		for (int i = 1; i < 100; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
		
		
	}

	
}
