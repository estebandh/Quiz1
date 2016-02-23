import java.util.Scanner;
public class PasserRating {
	static Scanner userInput = new Scanner(System.in);
	static double tdDouble;
	static double tyDouble;
	static double interDouble;
	static double compDouble;
	static double attDouble;
	public static void main(String[] args) {
		userInput();
		calcScore();

	}
	
	public static void calcScore(){
		double a= ((compDouble/attDouble)-.3)*5;
		double b= ((tyDouble/attDouble)-3)*.25;
		double c= (tdDouble/attDouble)*20;
		double d= 2.375- ((interDouble/attDouble)*25);
		System.out.println("Player rating: "+((a+b+c+d)/6)*100);
		
	}
	
	public static void userInput(){
		TD();
		totalYards();
		interceptions();
		completions();
		passAtt();
	}
	
	public static void TD(){
		try { 
			System.out.println("Enter the quarterback's touchdowns:");
			String td = userInput.next();
			tdDouble = Double.parseDouble(td);
		} catch(NumberFormatException e) {
			System.out.println("Error. Please enter an integer");
			TD();
		}
	}
	
	public static void totalYards(){
		try { 
			System.out.println("Enter the quarterback's total yards:");
			String ty = userInput.next();
			tyDouble = Double.parseDouble(ty);
		} catch(NumberFormatException e) {
			System.out.println("Error. Please enter a valid number");
			totalYards();
		}
	}
	
	public static void interceptions(){
		try { 
			System.out.println("Enter the quarterback's total interceptions:");
			String inter = userInput.next();
			interDouble = Double.parseDouble(inter);
		} catch(NumberFormatException e) {
			System.out.println("Error. Please enter an integer");
			interceptions();
		}
	}
	
	public static void completions(){
		try { 
			System.out.println("Enter the quarterback's total compeltions:");
			String comp = userInput.next();
			compDouble = Double.parseDouble(comp);
		} catch(NumberFormatException e) {
			System.out.println("Error. Please enter an integer");
			completions();
		}
	}
	
	public static void passAtt(){
		try { 
			System.out.println("Enter the quarterback's total attempted passes:");
			String att = userInput.next();
			attDouble = Double.parseDouble(att);
		} catch(NumberFormatException e) {
			System.out.println("Error. Please enter an integer");
			passAtt();
		}
	}
}
