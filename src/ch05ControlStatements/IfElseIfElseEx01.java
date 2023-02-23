package ch05ControlStatements;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseIfElseEx01 {

	/*
	 * public static void main(String args[]) { int Age=0; String s; try {
	 * InputStreamReader IN = new InputStreamReader(System.in); BufferedReader BR =
	 * new BufferedReader (IN); System.out.print("Enter your age: "); s =
	 * BR.readLine(); // reading string Age = Integer.parseInt(s); // converting
	 * String to integer
	 * 
	 * if(Age<=0) System.out.println("You have not borned yet!"); else if(Age>0 &&
	 * Age<=12) System.out.println("You are a child."); else if(Age>12 && Age<=19)
	 * System.out.println("You are a teen ager."); else if(Age>19 && Age<=40)
	 * System.out.println("You are young."); else if(Age>40)
	 * System.out.println("Wish your long life."); } catch(Exception E){ } }
	 * 
	 * 
	 */
	
	public static void main(String args[]) throws IOException { 

		char Ch;
		DataInputStream in = new DataInputStream(System.in);

		System.out.print("Enter the characterar to be tested: ");
		Ch= (char)System.in.read();
		if((Ch >= 'A') && (Ch <= 'Z'))
			System.out.println("You entered an upper case letter: " +Ch);
		else if((Ch >= 'a') && (Ch <= 'z'))
			System.out.println("You entered a lower case letter : " +Ch);
		else
			System.out.println("Oops!! You did not enter a letter!!");

		in.close();

	}
	
}
