package com.digisoft.traning.basics.threads;

public class PrintEvenNumbers extends Thread
{
	
	@Override
	public void run()
	{
		PrintOddAndEvenNumbers.printEvenNumbers();
	}

}
