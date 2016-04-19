package roshambo;

import java.util.Random;

public class randomPlayer extends Player {
public randomPlayer(String x){
	super (x);
}
	@Override
	public String generateRoshambo() {
		Random r = new Random();
		int x = r.nextInt(2);
		
		switch (x){
		
		case 0: 
			rValue =  "rock";
		case 1: 
			 rValue = "paper";
		case 2: 
			 rValue = "scissors";
		}
		return rValue;
	}

}
