package ch02StartupAndSetup;

import java.util.Scanner;

public class MustInputANumberEx1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int age;
		do {
			System.out.print("Please enter your age: ");
			while (!scanner.hasNextInt()) {
				System.out.println("That's not a valid age!, Please enter your age: ");
				scanner.next(); // this is important!
			}
			age = scanner.nextInt();
		} while ((age <= 0) || (age > 200));

		if (scanner != null) {
			scanner.close();
		}
		System.out.println("Hello! You are " + age + " year old");
		System.out.println("Thank you!");

	} // End of main()
} // End of class
