package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataValidatorapp {
	static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		printWelcome();
		
		
		System.out.println(" Enter a whole number  (exception handling");
		try {
			int nbr1 =sc.nextInt();
		}
		catch(InputMismatchException ime) {
			System.out.println("Invalid whole number");
			sc.nextLine();
		}
		
		System.out.println(" Enter a double :data validation");
		if(sc.hasNextDouble()) {
			double d1 =sc.nextDouble();
		}
		else {
			System.out.println(" Invalid double");
			sc.nextLine();
		}
		double db11 =getDouble("Enter ")
		
		//Need to check code again.it is not working for double
		
		System.out.println("Bye");
	}
	private static void printWelcome() {
		System.out.println(" Welcome to data validation");
	}
      private static int getInt(String prompt) {
    	  boolean success = false;
    	  int nbr =0;
    	  while(! success) {
    		  System.out.println("prompt");
    		  if (sc.hasNextInt()) {
    			 nbr =sc.nextInt(); 
    			 success =true;
    		  }
    		  else {
    			  System.out.println("Invalid whole number");
    			  sc.nextLine();
    		  }
    	  }
    	  
    	  
    	  return nbr;
    	  
      }
      private static double getDouble(String prompt) {
    	  boolean success = false;
    	  double nbr =0.0;
    	  while(! success) {
    		  System.out.println("prompt");
    		  if (sc.hasNextDouble()) {
    			 nbr =sc.nextDouble(); 
    			 success =true;
    		  }
    		  else {
    			  System.out.println("Invalid double number");
    			  sc.nextLine();
    		  }
    	  }
    	  
    	  
    	  return nbr;
    	  
}
      //validate String entry against two acceptable values
      private static String getString(String prompt,String s1,String s2) {
    	  String str ="";
    	  boolean success =false;
    	  while(!success) {
    		  System.out.println(prompt);
    		  str =sc.nextLine();
    		  if( str.length()==0) {
    			  System.out.println("Entry is requires .Try again");
    		  }
    		  else if( !str.equalsIgnoreCase(s1) && !str.equalsIgnoreCase(s2)) {
    			  System.out.println(" Entry must be ' ");
    		  }
    	  }
      }
      
}
