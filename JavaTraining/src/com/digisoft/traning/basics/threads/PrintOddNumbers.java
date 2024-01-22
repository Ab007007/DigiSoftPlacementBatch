package com.digisoft.traning.basics.threads;

public class PrintOddNumbers extends Thread
{
	
	@Override
	public void run()
	{
		PrintOddAndEvenNumbers.printOddNumbers();
	}

}
