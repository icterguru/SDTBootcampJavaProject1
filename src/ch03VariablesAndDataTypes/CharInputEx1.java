package ch03VariablesAndDataTypes;

import java.io.IOException;

public class CharInputEx1 {

	public static void main(String[] args) throws IOException 

	{
		// TODO Auto-generated method stub

		System.out.print("Enter a character: ");
		char ch = (char)System.in.read();
		System.out.print("You have entered " +ch);

	}

}
