package com.digisoft.traning.basics.threads;

public class PrintOddAndEvenUsingRunnable
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Demon " + Thread.currentThread().isDaemon());
		System.out.println("---- Printing numbers from 1-100");
		PrintOddRunnable pod = new PrintOddRunnable();
		PrintEvenRunnable pev = new PrintEvenRunnable();
		
		
		Thread t1 = new Thread(pod);
		Thread t2 = new Thread(pev);
		
		
		t1.setName("[ PrintOddNumbers ] : ");
		t2.setName("[PrintEvenNumbers ] : ");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		for (int i = 1; i < 100; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
		
		
	}

	
}
