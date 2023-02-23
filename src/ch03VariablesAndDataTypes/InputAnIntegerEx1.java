package ch03VariablesAndDataTypes;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputAnIntegerEx1 {

	
	
	  public static void main(String args[]) throws IOException {
	  
	  Scanner scnr = new Scanner(System.in);
	  
	  System.out.print("Please enter your age: ");
	  
	  int age = scnr.nextInt();
	  	  
	  System.out.println("Hello! You are "  + age + "year old");
	  System.out.println("Thank you!");
	  
	  scnr.close();
	  
		
		}	// End of main()
	} // End of class
