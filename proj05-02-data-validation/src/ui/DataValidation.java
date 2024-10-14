package ui;

import java.util.Scanner;

public class DataValidation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the dat validator App");
		Scanner sc = new Scanner(System.in);
		final double minDouble = 1;
		final double maxDouble = Double.MAX_VALUE;
		// while loop starts
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) 
		{
			double length =getDouble(  sc, "Enter Length",minDouble,maxDouble);
			double width =getDouble(  sc, "Enter width",minDouble,maxDouble);
			//processing area and Perimeter
			double area =length * width;
			double perimeter = 2*(length* width);
			
			//display output
			System.out.println(" Area :" + area);
			System.out.println(" Perimeter :" + perimeter);
			
			//validation choice : y or n; can't be empty
			choice = getString( sc, "Continue? (y/n): ","y","n");
		}
		System.out.println("Bye ");
		sc.close();
		
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
  
  
  private static double getDouble( Scanner sc, String prompt, double minDouble, double maxDouble) 
  
  {
   double number =0.0;	
   boolean isValid = false;
   while(!isValid) {
	   
   try {
	    System.out.println(prompt);
	    number = Double.parseDouble(sc.nextLine());
   
	   if(number < minDouble) {
		   System.out.println("Error : Number less than min " + minDouble);
	   }
	   else if(number> maxDouble) {
	    	System.out.println(" Error: Number is less than max" + maxDouble);
	    }
	    else {
	    	isValid =true;
	    }
   }
	   catch (NumberFormatException e ) {
		   System.out.println(" inValid  entry : please enter a valid double");
	   }
   }
   return number;
   
   }
  
  
}
