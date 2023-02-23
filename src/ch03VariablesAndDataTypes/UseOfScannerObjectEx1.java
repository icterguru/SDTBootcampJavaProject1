package ch03VariablesAndDataTypes;

import java.io.IOException;
import java.util.Scanner;


public class UseOfScannerObjectEx1 {

	// Demonstrate nextLine() and nextInt() with Scanner object 

	public static void main(String args[]) throws IOException { 

		Scanner scnr = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = scnr.nextLine();

		System.out.print("Enter an integer number: ");
		int number = scnr.nextInt();

		System.out.println("\nYour sentence: " + sentence);
		System.out.println("Your number: " + number);

		scnr.close();
	}

}
