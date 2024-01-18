package com.digisoft.traning.basics.exceptions;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class ThrowDemo {
	/*
	 * 1. Add Balance Checking functionality 2. Add Credit functionality 3. Ask user
	 * what he/she want to do 1. Balance Checking 2. Amount Withdraw 3. Credit
	 */
	static int balance = 10000;
	static Scanner sc = null;
	static String choice = "no";
	static int tempBalance;
	static int initChoice;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter your choice \n1.Credit\n2.Debit\n3.CheckBalance");
			initChoice = sc.nextInt();
			switch (initChoice) {
			case 1:
				credit();
				break;

			case 2:
				withdraw();
				break;

			case 3:
				checkBalance();	
				break;

			default:
				System.out.println("Please enter proper choice");
				break;
			}
			System.out.println("Do you want to perform one more transaction : yes/no");
			choice = sc.next();
		} while (choice.equals("yes"));

		System.out.println("Thank you for using Banking Application");
	}

	public static void checkBalance()
	{
		System.out.println("Your available blance is " + balance);
	}
	public static void credit() {
		System.out.println("Enter the Amount that you want to Credit");
		int amount = sc.nextInt();
		if(amount<=0) {
			System.out.println("Please Enter Valid Amount to Credit!!!");
		}
		else
		{
			balance = balance + amount;
			System.out.println("Your available blance is " + balance);
			
		}
		
	}
	public static void withdraw() {
		tempBalance = balance;
		System.out.println("Welcome to Bank Transaction!!!!");
		System.out.println("Enter the Amount that you want to withdraw");
		int amount = sc.nextInt();
		tempBalance = tempBalance - amount;
		if (tempBalance < 0) {
			try {
				throw new BalanceInsufficientException(balance);
			} catch (BalanceInsufficientException ex) {
				System.out.println(ex.getMessage());
			}
		} else {
			balance = tempBalance;
			System.out.println("Withdraw : " + amount + " is successfull");

		}
		System.out.println("Your available blance is " + balance);

	}

}
