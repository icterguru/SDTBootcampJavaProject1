package ch09ClassAndObject;

/* Implementing Array of Objects */
class StudentD {
	int Roll;
	String Name;
	double Mark;

	StudentD(int R, String N, double M) {
		Roll = R;
		Name = N;
		Mark = M;
	}

	void display() {
		System.out.println(" Roll is : " + Roll);
		System.out.println(" Name is : " + Name);
		System.out.println(" Mark is : " + Mark);
	}
}

public class ObjectArrayEx1 {
	public static void main(String args[]) {
		StudentD S[] = new StudentD[10];
		// S is an object array of Student class
		S[0] = new StudentD(101, "Mira   ", 70.5);
		S[1] = new StudentD(102, "Masud  ", 75.5);
		S[2] = new StudentD(103, "Monira ", 85.5);
		S[3] = new StudentD(104, "Monirul", 80.5);
		for (int i = 0; i <= 3; i++) {
			System.out.println("\nRecord of S[" + i + "] is : " + i);
			S[i].display();
		}
	}
}
