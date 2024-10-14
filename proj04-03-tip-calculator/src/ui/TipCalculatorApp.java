package ui;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		//DecimalFormat to format the currency values
		DecimalFormat df = new DecimalFormat("0.00");
		
		String choice ="y";
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println(" Welcome to the tip Calculator");
			System.out.println(" Enter the cost of the meal");
			double mealcost = sc.nextDouble();
			
			// Calculate the tip amounts for 15%, 20% and 25%
			double tip15 = round(mealcost *0.15);
			double tip20 = round(mealcost *0.20);
			double tip25 = round(mealcost *0.25);
			
			//Calculate the total amount
			double total15 = mealcost+ tip15;
			double total20 = mealcost + tip20;
			double total25 = mealcost + tip25;
			
			//Display the tip Calculator
			System.out.println(" Tip Claculator\n\n");
			System.out.println(" \n15%");
			System.out.println("Tip amount :  $"+ df.format(tip15));
			System.out.println(" Total Amount $:" + df.format(total15));
			
			System.out.println(" Tip Claculator\n\n");
			System.out.println(" \n20%");
			System.out.println("Tip amount :  $"+ df.format(tip20));	
			System.out.println(" Total Amount:  $" + df.format(total20));
			
			
			System.out.println(" \n25%");
			System.out.println("Tip amount: $"+ df.format(tip25));
			System.out.println(" Total Amount:  $" +df.format(total25));
			sc.nextLine();
			
			//Ask the user if they want to continue
			System.out.println("\n continue ? (y/n)");
			choice =sc.nextLine();
			
		}
		sc.close();
			
	}
	
	//method for rounding the values to 2 decimal place
	private static double round(double value) {
		return Math.round(value * 100.0) /100.0;
		
	}
	

}
