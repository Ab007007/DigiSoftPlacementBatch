package com.digisoft.traning.basics.threads;

public class PrintEvenRunnable implements Runnable
{
	
	@Override
	public void run()
	{
		PrintOddAndEvenNumbers.printEvenNumbers();
	}

}
