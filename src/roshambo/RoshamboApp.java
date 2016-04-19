package roshambo;

import java.util.Scanner;


public class RoshamboApp {
	static Scanner scan1 = new Scanner(System.in);
	static String userName = "";
	static String rValue = "";

	public static void main(String[] args) {
		String userInput = "y";
		String opponent = "";
		System.out.println("Welcome to Rock Paper Scissors!");

		System.out.print("Enter your name: ");
		userName = scan1.nextLine();
		System.out.print("Would you like to play against The Rock or The Rando? (r/n): ");
		opponent = scan1.nextLine();
		opponent.toLowerCase();
		do {
			switch (opponent) {
			case "r":
				runGame(new humanPlayer(userName), new rockPlayer("The Rock"));
				break;
			case "n":
				runGame(new humanPlayer(userName), new randomPlayer("The Rando"));
				break;
			}
			System.out.print("Play again? (y/n): ");
		userInput = scan1.nextLine();
		} while (userInput.equalsIgnoreCase("y"));
		System.out.println("Thanks for playing!");
}
	public static void runGame(Player p1, Player r1) {
		p1.name = userName;
		System.out.print("Rock, paper, or scissors?: ");
		p1.rValue = readRPS("rock","paper","scissors");
		playGame(p1.rValue, r1.generateRoshambo(), p1, r1);

	}

	public static String readRPS(String x, String y, String z) {
		String a = scan1.nextLine();

		while (!(a.equalsIgnoreCase(x) || a.equalsIgnoreCase(y) || a.equalsIgnoreCase(z))) {
			System.out.print("Invalid option, use 'rock' 'paper' or 'scissors");
			a = scan1.nextLine();
		}
		return a;
	}

	public static void playGame(String human, String comp, Player p1, Player rn1) {
		System.out.println("\n" + p1.getName() + ": " + p1.rValue);
		System.out.println(rn1.getName() + ": " + rn1.getrValue() + "\n");

		if (human.equals(comp)) {
			System.out.println("It's a tie!");
		} else if (human.equals("rock")) {
			if (comp.equals("scissors"))
				System.out.println("Rock crushes scissors. You win!!");
			else if (comp.equals("paper"))
				System.out.println("Paper eats rock. You lose!!");
		} else if (human.equals("paper")) {
			if (comp.equals("scissors"))
				System.out.println("Scissor cuts paper. You lose!!");
			else if (comp.equals("rock"))
				System.out.println("Paper eats rock. You win!!");
		} else if (human.equals("scissors")) {
			if (comp.equals("paper"))
				System.out.println("Scissor cuts paper. You win!!");
			else if (comp.equals("rock"))
				System.out.println("Rock breaks scissors. You lose!!");
		}
	}
}
