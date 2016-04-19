package roshambo;

import java.util.Scanner;

public class humanPlayer extends Player {
public humanPlayer(String x){
	super (x);
}
	@Override
	public String generateRoshambo() {
		Scanner scan1 = new Scanner(System.in);
		rValue = scan1.nextLine();
		return rValue;
	}
}
