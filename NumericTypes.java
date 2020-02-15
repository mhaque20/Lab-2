/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		
		//TASK #2 Create a Scanner object here
		Scanner in = new Scanner (System.in);
		
		//identifier declarations
	    final double NUMBER = 2; // number of scores
		int score1; // first test score
		int score2; // second test score
	    int F = 212; // boiling temperature
		double C; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		double temp;
		
		//Task #2 prompt user to input score1
		System.out.print("Enter the first score: ");
		
		//Task #2 read score1
		score1 = in.nextInt();
		
		//Task #2 prompt user to input score2
		System.out.print("Enter the second score: ");
		
		//Task #2 read score2
		score2 = in.nextInt();
		
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		
		System.out.println(output);
		
		// Convert Fahrenheit temperatures to Celsius
		C = (5/9.0) * (F - 32);
		
		output = F + " in Fahrenheit is " + C + " in Celsius.";
		System.out.println(output);
		
		//Task #2 prompt user to input another temperature
		System.out.print("Enter temperature in Fahrenheit :");
		
		//Task #2 read the user’s temperature in Fahrenheit
		temp = in.nextDouble();
		
		//Task #2 convert the user’s temperature to Celsius
		C = (5/9.0) * (temp - 32);
		
		//Task #2 print the user’s temperature in Celsius
		System.out.println(temp + " in Fahrenheit is " + C + " in Celsius.");
		
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}

