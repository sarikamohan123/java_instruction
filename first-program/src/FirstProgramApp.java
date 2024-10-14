import java.util.Scanner;

public class FirstProgramApp {

	public static void main(String[] args) {
		System.out.println(" Welcome to my first java program");
		
		// this is one line comment
		
		/*
		 * this 
		 * is multi line comment
		 */
		
		// int and double are primitive data types
		int a =5;
		int b =9;
		int sum = a+b;
		System.out.println(" Sum is:" + sum);
		// double for decimal values( not decimal type)
		double  price = 19.99;
		
		int c =9/5;
		int r =9%5;
		System.out.println(" C is" +c);
		
		String name = " Bob Marley";
		System.out.println(" Full Name is: "+ name);
		
		//p57 getting input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println(" Hi, What's your name?");
		name = sc.nextLine();
		System.out.println(" Enter a whole number");
		int nbr2 = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter another whole number");
		int nbr3 = Integer.parseInt(sc.nextLine());
		sc.nextLine();
		String choice ="y";
		System.out.println("Continue (y/n)?");
		      String resp = sc.nextLine();
		      if (choice ==resp) {
		    	  System.out.println(" choice and resp are the same");
		    	  		      }
		      
		      if(choice.equalsIgnoreCase(resp) ) {
		    	  System.out.println("equals method-same");
		      }
		System.out.println("Good Bye");
		System.out.println("\n while loop demo");
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Continue? ");
			choice = sc.nextLine();
		}
		System.out.println("Good Bye");
				
				
	}

}
