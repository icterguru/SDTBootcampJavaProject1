package ch03VariablesAndDataTypes;

public class InputASingleCharEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DataInputStream in = new DataInputStream(System.in);
		char ch;
		try{
			System.out.print("Enter a character: ");
			ch = (char)System.in.read();
			// Accepts a single character
			
			System.out.print("You have entered " +ch);

		}

		catch(Exception e){}

	}

}
