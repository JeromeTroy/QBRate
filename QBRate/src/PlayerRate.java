import java.util.Scanner;
public class PlayerRate {

private double rate;
private double attempts;
private double completions;
private double yards;
private double touchdown;
private double interceptions;

public PlayerRate(){
	System.out.print("Enter the players number of touchdowns: ");
	this.touchdown = getInput();
	System.out.print("\nEnter the players total yards: ");
	this.yards = getInput();
	System.out.print("\nEnter the players interceptions: ");
	this.interceptions = getInput();
	System.out.print("\nEnter the players completions: ");
	this.completions = getInput();
	System.out.print("\nEnter the players attempts: ");
	this.attempts = getInput();
	this.rate = rating(this.touchdown,this.yards,this.interceptions,
			this.completions,this.attempts);
}
public double getTouchDowns(){
	return this.touchdown;
}
public double getYards(){
	return this.yards;
}
public double getInterceptions(){
	return this.interceptions;
}
public double getCompletions(){
	return this.completions;
}
public double getAttempts(){
	return this.attempts;
}
public double getRate(){
	double r = this.rate;
	r = Math.round(r*10)/10;
	return r;
}

protected static double getInput() {
	Scanner input = new Scanner(System.in);
	double val = input.nextDouble();
	return val;
}
protected double rating(double td, double yd, double inte,double comp, double att) {
	double a = ((comp/att)-.3)*5;
	double b = ((yd/att)-3)*.25;
	double c = (td/att)*20;
	double d = 2.375-((inte/att)*25);
	double r = (a+b+c+d)/6*100;
	return r;
}
public static void main(String[] args){
	PlayerRate dude = new PlayerRate();
	System.out.println("This players rating is: " + dude.getRate());
}
}
