import java.util.Scanner;

public class TemperatureCalculatorApp {

	public static void main(String[] args) {
		
		//Create a public scanner to take user input
		Scanner scanner =new Scanner(System.in);
		String choice ="y";
		while(choice.equalsIgnoreCase("y")) {
			
			//Prompt the user to enter the temperature in Fahrenheit
			System.out.println(" Enter temperature in Fahrenheit");
			
			double fahrenheit =scanner.nextDouble();
			//Convert Fahrenheit to  celsius
			double celsius = (fahrenheit -32)*5/9;
			
			//Format the ouput to 2 decimal places
			System.out.printf(" Temperature in Celsius is: %.2f%n",celsius);
			
			// ask if the user wants to continue
			System.out.println(" Do you want to continue? (y/n):");
			choice =scanner.next();
			
			
			
		}
		System.out.println(" Thank you using our App");
		   scanner.close();
		
	}


}
