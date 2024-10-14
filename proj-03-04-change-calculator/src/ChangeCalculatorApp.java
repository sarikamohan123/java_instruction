import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
			
			System.out.println(" Please enter number of cents between 0 -99 ");
			int cents = sc.nextInt();
			int quarters = cents/25;
			//update cents after calculating quarters
			cents %= 25;
			int dimes = cents/10;
			//Update cents after calculating dimes
			cents %= 10;
			int nickels = cents/5;
			// update cents after calculating nickels
			cents %= 5;
			// the remaining cents are pennies
			int pennies =cents;
			
			// Display the results
			System.out.println();
			System.out.println(" Quarters:  " + quarters);
			System.out.println(" Dimes:  "    +  dimes  );
			System.out.println(" Nickels:  "  +  nickels);
			System.out.println(" Pennies:  "  +  pennies);
			
			System.out.print(" Do you want to continue? (y/n):  ");
			choice = sc.next();
		}
		
		System.out.println(" Thank you for using our App");
		sc.close();
	}

}
