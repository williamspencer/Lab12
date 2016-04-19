package roshambo;

public class rockPlayer extends Player {
public rockPlayer (String x){
	super (x);
}
	@Override
	public String generateRoshambo() {
		rValue = "rock";
		return  rValue;
	}

}
