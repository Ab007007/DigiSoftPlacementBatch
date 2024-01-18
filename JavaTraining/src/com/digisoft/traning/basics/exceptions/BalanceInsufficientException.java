package com.digisoft.traning.basics.exceptions;

import java.sql.Blob;

public class BalanceInsufficientException extends Exception
{
	public BalanceInsufficientException() {
		System.out.println("Your Balance is too low!!!!");
	}
	
	
	
	public BalanceInsufficientException(int balance) {
		System.out.println("Your Balance is too low!!!!, you have " + balance + " in your account");
	}
	
	
	
	@Override
	public String getMessage() {
		return "You are not allowed to withdraw less than your balance";
	}
	
	
	
}
