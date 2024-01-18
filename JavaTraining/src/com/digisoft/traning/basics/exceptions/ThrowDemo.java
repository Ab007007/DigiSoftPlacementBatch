package com.digisoft.traning.basics.exceptions;

import java.util.Scanner;

public class ThrowDemo 
{
	/*
	 * 1. Add Balance Checking functionality
	 * 2. Add Credit functionality
	 * 3. Ask user what he/she want to do 
	 * 			1. Balance Checking
	 * 			2. Amount Withdraw
	 * 			3. Credit
	 */
	static int balance = 10000;
	static Scanner sc = null;
	static String choice = "no";
	public static void main(String[] args) 
	{
		int tempBalance ;
		sc = new Scanner(System.in);
		do {
			tempBalance = balance;
			System.out.println("Welcome to Bank Transaction!!!!");
			System.out.println("Enter the Amount that you want to withdraw");
			int amount = sc.nextInt();
			tempBalance = tempBalance - amount;
			if(tempBalance<0)
			{
				try
				{
					throw new Exception();
				}
				catch(Exception ex)
				{
					System.out.println("Balance is low!!! Please enter the amount with in " + balance);
				}
			}
			else
			{
				balance = tempBalance;
				System.out.println("Withdraw : " + amount + " is successfull");
				
			}
			System.out.println("Your available blance is "  +balance);
			System.out.println("Do you want to perform one more transaction : yes/no");
			choice = sc.next();
		}while(choice.equals("yes"));
	
	System.out.println("Thank you for using Banking Application");
	}

}
