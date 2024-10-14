package ui;

import java.util.Scanner;

public class DiceRollerApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String rollAgain = "y";
		while (rollAgain.equalsIgnoreCase("y")) {
			//roll the dice
			int die1 = rollDie();
			int die2 =rollDie();
			int total = die1 + die2;
			
			//Display the dice value and total
			System.out.println(" \nDie 1: " + die1);
			System.out.println(" \nDie 2: " + die2);
			System.out.println(" \nTotal: " + total);
			
			//Check for special cases : snake eyes or boxcars
			if(die1 ==1 && die2 ==1) {
				System.out.println("Snake Eyes!");
			}
			else if( die1 == 6 && die2 ==6) {
				System.out.println(" Boxcars!");
			}
			
			//Ask if user want to continue
			System.out.println(" Do you want to continue? (y/n)");
			rollAgain = sc.next();
				
		}
			System.out.println(" Thank you for choosing our app");
			sc.close();
								
	  }
		
		public static int rollDie() {
			//Math.random method returns double and its is between 0.0-1.0
			// so in order to get value 1-6,we are multiplying with 6
			//that will give us value between 0.0 and 5.999
			// then we are casting the result into int that gives a value between 0 and 5
			// to shift the range from 0-5 to 1-6, we add 1
			return (int) (Math.random() *6) +1;
		}
	}


