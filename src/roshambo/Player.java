package roshambo;

public abstract class Player {
String name;
String rValue;

public Player(){}
public Player(String x){
	name = x;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getrValue() {
	return rValue;
}
public void setrValue(String rValue) {
	this.rValue = rValue;
}
public Player (String x, String y){
	name = x;
	rValue = y;
}

public abstract String generateRoshambo();
}
