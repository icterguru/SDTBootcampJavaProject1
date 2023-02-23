package ch10ConstructorAndMethod;

/* using Copy Constructor Method   */

class Student7 {
	int Roll;
	String Name;
	float Mark;

	Student7() // Default Constructor
	{

	}

	Student7(int R, String N, float M) // Argumented Constructor
	{
		Roll = R;
		Name = N;
		Mark = M;
	}

	Student7(Student7 S) // Copy Constructor
	{
		Roll = S.Roll;
		Name = S.Name;
		Mark = S.Mark;
	} // Copy Constructor Defined

	void display() {
		System.out.println("Roll is : " + Roll);
		System.out.println("Name is : " + Name);
		System.out.println("Mark is : " + Mark);
	}

}

public class CopyConstructorEx2 {
	public static void main(String args[]) {
		Student7 S1 = new Student7(101, "John Smith", 98.5F); // Argumented Constructor Invoked
		System.out.println("Record of S1 : ");
		S1.display();
		System.out.println();
		Student7 S2 = new Student7(S1); // Copy Constructor Invoked
		System.out.println();
		System.out.println("Record of S2 : ");
		S2.display(); // displays Record of S1
		System.out.println("\nBoth are Same ... ... ... ");

	}
}
