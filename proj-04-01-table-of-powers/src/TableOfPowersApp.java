import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String choice = "y";
	    while( choice.equalsIgnoreCase("y")) {
	    	System.out.println(" Enter an  integer");
	    	 int integer =sc.nextInt();
	    	 
	    	 //Print the header of the table
	    	 System.out.println("\nNumber    Squared     Cubed");
	    	 System.out.println("=========   ========     =====");
	    	 
	    	 for( int i=1; i<= integer; i++) 
	    	 {
	    		 int square = i * i;
	    		 int cube = i * i * i;
	    		 
	    		// print the value in the formated form
	    		 System.out.printf("%-7d    %-20d   %-8d%n",i,square,cube);
	    		 
	  	    }
	    	 //Ask the user if they want to continue
	    	 System.out.println(" Do you want to continue? (y/n): ");
	    	 choice = sc.next();
	    		 
	    	 }
	    
	    System.out.println( " Thank you for choosing our App");
	    }
	
	}


