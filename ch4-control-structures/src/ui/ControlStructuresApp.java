package ui;

import java.text.NumberFormat;
import java.util.Scanner;

public class ControlStructuresApp {

	public static void main(String[] args) {
		System.out.println(" Welcome to ch -4");
		Scanner sc = new Scanner(System.in);
//		String choice ="y";
//		while(choice.equalsIgnoreCase("y")) 
//		{
//		
//		System.out.println("Traffic light");
//		System.out.println("whats the light color?");
//		String color =sc.nextLine();
//		if(color.equalsIgnoreCase("red")) {
//			System.out.println(" Stop");
//		}
//		else if (color.equalsIgnoreCase("yellow"))
//		{
//			System.out.println(" Slow Down");
//		}
//		else if (color.equalsIgnoreCase("green"))
//		{
//			System.out.println(" Go");
//		}
//		else {
//			System.out.println(" Invalid color");
//		}
//		System.out.println("continue ?");
//		choice =sc.nextLine();
//	}	
//		System.out.println("\n Command Menu");
//		System.out.println("1 - Attack");
//		System.out.println("2 -Block");
//		System.out.println("3- Run Away");
//		System.out.println("Command: ");
//		String command =sc.nextLine();
//		switch(command) {
//		case "1":
//			System.out.println("Arrgh!!!");
//			break;
//		case "2":
//			System.out.println("Blocked the hit");
//			break;
//		case "3":
//			System.out.println("Ahhh...run away");
//			break;
//			default:
//			System.out.println("Invalid command");
//			break;
//		}
//		//ctrl +f11 runs the project
//		//ctrl +shift +o automatically add the scanner utility
		
		
		System.out.println(" \n for loops..");
		System.out.println(" \n for loops from 0 -10..");
		
		for (int i =0; i<10;i++) {
			System.out.println("i "+i);
		}
		
		
		System.out.println(" \n for loops..");
		System.out.println(" \n for loops from 0 -100,by 5.");
		
		for (int i =0; i<=100;i+=5) {
			System.out.println("i "+i);
		}
		System.out.println(" \n for loops..");
		System.out.println(" \n for loops from 3-99, backward by 3.");
		
		for (int i= 99; i>=3; i-=3) {
			System.out.println("i "+i);
		}
		System.out.println(" \n for loops..");
		System.out.println(" \n percentages ...1.0% to 5.0% by .25.");
		
		NumberFormat pFormat =NumberFormat.getPercentInstance();
		pFormat.setMinimumFractionDigits(0);//need to look at the video to complete it
		for (double d = 1.0; d<= 5.0; d+=.25) {
			double pct =d/100;
			System.out.println("d "+ d +"");
		}
		
		
		System.out.println("Bye");
		
		//need to complete this demonstration
	}

}
