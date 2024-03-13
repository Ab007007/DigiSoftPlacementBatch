package java18.innerclasses.operator;

import java18.innerclasses.Greetable;
import java18.innerclasses.lambda.A;

public class OperatorDemo 
{
	void printMyName() {
		System.out.println("My name is Aravind");
	}
	
	
	static void printMyName(String name) {
		System.out.println("Good Morning, My name is " + name);
	}
	
	
	
	public static void main(String[] args) {
		A tb = new OperatorDemo() ::printMyName;
		
		tb.printName();
		
		
		Greetable gb = OperatorDemo::printMyName;
		gb.greet("Kiran Kumar");
	}

	
	
	
}
