package ch10ConstructorAndMethod;

/*   Using public Finalize Method  */
class Sample {
	// ... ... ...
	Sample() // Constructor Defined
	{
		System.out.println("Constructor Called.");
		// ... ... ...
	}

	public void finalize() // Finalize Defined
	{
		// ... ... ...
		System.out.println("Finalize Called.");
	}
}

public class FinalizeMethodEx1 {
	public static void main(String args[]) {
		Sample S = new Sample();
		System.out.println("\n... ... ... ... ...");
		S.finalize(); // Calling Finalize Method
	}
}
