package com.digisoft.traning.basics.loops;

public class PatterSquare {

	
	public static void main(String[] args) {
		
		System.out.println("welcome to pattern progrm");
		
		generteSquare();
	
		generateTriangle();
	
	}

	private static void generateTriangle() {
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j <=i ; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}

	private static void generteSquare() {
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
