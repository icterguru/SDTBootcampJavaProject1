package ch10ConstructorAndMethod;

class Student3 {
	int Roll;
	String Name;
	float Mark;

	Student3() // Default Constructor
	{

	}

	Student3(int R, String N, float M) // Argumented Constructor
	{
		Roll = R;
		Name = N;
		Mark = M;
	}

	Student3(Student3 S) // Copy Constructor
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

public class CopyConstructorEx1{
	
	public static void main(String args[]) {
		
		Student3	S1 = new Student3(); 	// Default Constructor Invoked
		System.out.println("Record of S1 : " );
		S1.display();
		System.out.println();
		
		Student3 S2 = new Student3(101, "Mahdi", 80); // Argumented Constructor Invoked
		System.out.println("Record of S2 : " );
		S2.display();
		
		Student3   S3 = new Student3(S2);  //  Copy Constructor Invoked
		System.out.println();
		System.out.println("Record of S3 : " );
		S3.display();  // displays Record of S2

		S3 = S1;  //  Object S3 is initialized by S1
		System.out.println();
		System.out.println("Now Record of S3 : " );
		S3.display();	// displays Record of S2
	}
}