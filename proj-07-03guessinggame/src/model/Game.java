package model;

import java.util.Random;

import util.Console;

public class Game {

	private int targetNumber; // the number to guess
	private int numOfTries; //no of tries
	
	public  Game() {
		resetGame();
	}
	
	public void resetGame() {
		Random rand = new Random();
		targetNumber = rand.nextInt(100) +1;
		numOfTries =0;
	}
	
	// the core idea of the game
	
	public void play() {
		
		Console.printLine("I am thinking of a number between 1 and 100. Can you guess it???");
		boolean success =false;
		
		while(!success) {
			int guess = Console.getInt(" Enter the number:");
			numOfTries++;
			if( guess > targetNumber) {
				Console.printLine("Too high! Guess Again!");
			}
			else if(guess < targetNumber) {
				Console.printLine(" Too low! Guess again");
			}
			else {
				Console.printLine("You got it in " + numOfTries +"tries");
				if(numOfTries == 1) {
					Console.printLine("Great Work! You are a mathematical wizard");
				}
				else if(numOfTries<= 7) {
					Console.printLine("Not too bad.You have really got some potential!");
				}
				else {
					Console.printLine("That was a tough one");
				}
			}	
		}success = true;
	
	}
	
	
}
