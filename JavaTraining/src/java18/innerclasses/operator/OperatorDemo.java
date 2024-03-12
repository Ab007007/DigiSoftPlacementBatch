package java18.innerclasses.operator;

import java18.innerclasses.lambda.A;

public class OperatorDemo 
{
	void printMyName() {
		System.out.println("My name is Aravind");
	}
	
	public static void main(String[] args) {
		A tb = new OperatorDemo() ::printMyName;
		
		tb.printName();
	}

	
	
	
}
