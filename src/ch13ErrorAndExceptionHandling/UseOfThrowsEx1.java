package ch13ErrorAndExceptionHandling;

/*  Using throws Statement  */
import  java.io.*; 
public class UseOfThrowsEx1 {
	static int setInt() throws IOException  {
		BufferedReader BR = 
				new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		String S = BR.readLine();
		return Integer.parseInt(S);
	}

	public static void main(String args[]) {
		int x=0, y=0, d=0;
		try {
			x = setInt();
			y = setInt();
			d = x/y;
		}
		catch(IOException E) {
			System.out.println("[" + E +"]");
		}
		System.out.println(x +"/" +y + " = " +d);
	}
}
