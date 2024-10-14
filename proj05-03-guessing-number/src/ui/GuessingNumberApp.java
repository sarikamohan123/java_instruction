package ui;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberApp {
	 public static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		
		
		String playAgain = "y";
		
		System.out.println(" Welcome to the number guessing game");
		System.out.println("====================================");
		while( playAgain.equalsIgnoreCase("y")) 
		{
			playGame(sc);
			playAgain = getString(sc," Try again? (y/n ;", "y","n");
		}
		System.out.println(" Bye- Come back soon");
			
	}
	
	//Method to play Game
	private static void playGame( Scanner sc) 
	{
		
		Random random =new Random();
		int randomNumber =random.nextInt(100) + 1;
		int guessCount = 0;
		int guess = -1;// initial guess value outside valid range to start loop
		System.out.println("\n I am thinking of a number from 1 to 100");
		System.out.println(" Try to guess it");
		// Main guessing loop
		while (guess != randomNumber) 
		{
			guess =getInt(sc," Enter a number ",1, 100);
			guessCount++;
			if ( guess > randomNumber) {
				if(guess -randomNumber >10) {
					System.out.println(" Way too high! Guess again.");
				}else {
					System.out.println(" Too high! Guess Again");
			   }
				
			}
			else if( guess< randomNumber) {
				if (randomNumber -guess >10)
				{
					System.out.println(" Way too low! Guess again");
				}
			else 
			{
				System.out.println(" too low guess again");
			}
			
				
			
		}
		
	}
	    //User guessed correctly ,display result
	     displayResult(guessCount);
	}
	
	
	
	// Method to display result
	private static void displayResult(int guessCount)
	{
		System.out.println( "You got this in" + guessCount +"tries.");
		if (guessCount<=3)
		{
			System.out.println(" Great work! You are a mathematical wizard");
		}else if (guessCount <=7)
		{
			System.out.println(" Not too bad! you have got some potentia");

		}else {
			System.out.println(" What took you so long? Maybe you should take some lessons");
		}
	}
	
	
		// Method to handle  to validate an integer within a specific range
	
	private static int getInt(Scanner sc, String prompt, int min, int max)
	{
		int input;
		while(true) 
		{
			System.out.print(prompt);
			if(sc.hasNextInt()) {
				input =sc.nextInt();
				if( input>=min && input<= max) {
					return input;
				} else {
					System.out.println(" Error :Number must be between " +min+ "and"+ max +".");
					
				}
			}else {
				System.out.println(" error! Invalid number.Try again.");
				sc.next();// discard invalid input
			}
			
			
		}
		
	}
	
	

	// Method to get a required string(empty values not acccepted, that is either s1 or s2
  private static String getString(Scanner sc,String prompt, String s1,String s2) 
  {
	String strValue ="";
	boolean isValid = false;
	while(!isValid) 
	{
		System.out.println(prompt);
		strValue = sc.nextLine().toLowerCase();
		if(strValue == "") {
			System.out.println(" Error : input is required. ");
			sc.next();
		}
		else if(!strValue.equals(s1) &&  !strValue.equals(s2) ) {
			System.out.println(" Error : Entry must be either'" +s1 + "' or '"+ s2 +"'");
			
		}
		else {
			isValid =true;
		     }
	   }
	    return strValue;
  }
  
	}
	
	
	
	


