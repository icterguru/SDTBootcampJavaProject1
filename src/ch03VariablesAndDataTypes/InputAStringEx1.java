package ch03VariablesAndDataTypes;

import java.io.IOException;
import java.util.Scanner;

public class InputAStringEx1 {

	
	
	  public static void main(String args[]) throws IOException {
	  
	  Scanner scnr = new Scanner(System.in);
	  
	  System.out.print("Please enter your name: ");
	  
	  String name = scnr.nextLine();
	  	  
	  System.out.println("Hello! "  + "\"" + name + "\"" );
	  System.out.println("Thank you!");
	  
	  scnr.close();
	  
		
		}	// End of main()
	} // End of class
