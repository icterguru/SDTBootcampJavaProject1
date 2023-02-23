package ch14IOAndFileOperations;
import java.util.Scanner;

public class ScannerInputEx2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numOfPlayers;
		do {
			System.out.print("Select the amount of players (1 or 2): ");
			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number!, Please enter 1 or 2");
				scanner.next(); // this is important!
			}

			numOfPlayers = scanner.nextInt();
		} while ((numOfPlayers <= 0) || (numOfPlayers > 2));
		if(scanner != null) {
			scanner.close();
		}
		System.out.println("You've selected " + numOfPlayers+" player(s).");

	}	// End of main()
} // End of class

