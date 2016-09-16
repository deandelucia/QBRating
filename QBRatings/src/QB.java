import java.util.Scanner;

public class QB {
	public int touchdowns;
	public int total_yards;
	public int interceptions;
	public int completions;
	public int passes_attempted;
	
	QB(){
		touchdowns = 0;
		total_yards = 0;
		interceptions = 0;
		completions = 0;
		passes_attempted = 0;
		
	}
	QB(int td, int ty, int ic, int comp, int pa){
		touchdowns = td;
		total_yards = ty;
		interceptions = ic;
		completions = comp;
		passes_attempted = pa;
		
		
		
	}
	public double calculate(){
		double a = ((completions/passes_attempted) - .3)*5;
		double b = ((total_yards/passes_attempted)-.3)*.25;
		double c = (touchdowns/passes_attempted)*20;
		double d = 2.375-(interceptions/passes_attempted*25);
		return ((a+b+c+d)/(6.0))*100;
	}
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter amount of touchdowns:");
		int td = scan.nextInt();
		
		System.out.println("Enter amount of total yards:");
		int ty = scan.nextInt();
		
		System.out.println("Enter amount of interceptions:");
		int ic = scan.nextInt();
		
		System.out.println("Enter amount of completions:");
		int comp = scan.nextInt();
		
		System.out.println("Enter amount of passes attempted:");
		int pa = scan.nextInt();
		
		QB quarterback = new QB(td,ty,ic,comp,pa);
		double rating = quarterback.calculate();
		System.out.println("The QB Rating is: "+rating);
		
	}

}
