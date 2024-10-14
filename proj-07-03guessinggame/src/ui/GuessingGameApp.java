package ui;

import model.Game;
import util.Console;

public class GuessingGameApp {

	public static void main(String[] args) {
		
		Console.printLine("Welcome to the Guessing Game App");
		Console.printLine("===============================");
		Game game =new Game();
		boolean  playAgain = true;
		
		while(playAgain) {
			
			game.play(); //play the game
			String choice = ("Try Again? (y/n)");
			if(choice.equalsIgnoreCase("y")) {
				game.resetGame();
			}
			else {
				playAgain = false;
				Console.printLine("Thank you using our App-Bye,come back soon");
			}
			
			
		}
		

	}
	
	public static boolean getYesOrNo(String prompt) {
		String choice;
		boolean isValid = false;
		while(true) {
			choice = Console.getRequiredString(prompt);
			if (choice.equalsIgnoreCase("y")) {
			return true;}
			else if(choice.equalsIgnoreCase("n")) {
				return false;
			} else {
				Console.printLine("Error! Entry must be'y' or'n' -Try again");
			}
			
					
			
		}
			
		
		
	}
	
	 

}
