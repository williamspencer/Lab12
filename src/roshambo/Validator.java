package roshambo;

import java.util.Scanner;

public class Validator {
	static Scanner scan = new Scanner(System.in);
	
	public String readRPS(String x, String y, String z) {
		String a = scan.nextLine();

		while (!(a.equalsIgnoreCase(x) || a.equalsIgnoreCase(y) || a.equalsIgnoreCase(z))) {
			System.out.print("Invalid option, use 'rock' 'paper' or 'scissors");
			a = scan.nextLine();
		}
		return a;
	}
}

