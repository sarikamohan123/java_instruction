import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		 String choice ="y";
		 while( choice.equalsIgnoreCase("y")) {
			 System.out.println(" Welcome to the Travel Time Calculator");
			 System.out.println("Enter the distance in miles");
			 double miles = sc.nextDouble();//Read miles 
			 System.out.println("Enter the speed in miles/hour");
			 double milesPerHour =sc.nextDouble(); //read speed in miles per hour
			 //Calculate travel time in hours
			 double totalHours = miles/ milesPerHour;
			 
			 // Separate hours and minutes using integer arithmetic
			 int hours = (int)totalHours; //Get the whole hours
			 int minutes = (int)( (totalHours -hours) * 60);
			 
			 //Display the estimated travel time
			 System.out.println(" \n Estimated travel time");
			 System.out.println("---------------------------");
			 System.out.printf(" Hours:     %d%n",hours);
			 System.out.printf(" Minutes:     %d%n",minutes);
			 
			 //Ask user if they want to continue
			 System.out.println(" Continue? (y/n): ");
			 choice = sc.next();// Read user input for continuation
		 }
		 
		 System.out.println(" Thank you for using our App!");
		  sc.close();
			 
		 }
	}


