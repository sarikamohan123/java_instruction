import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String choice = "y";
		while( choice.equalsIgnoreCase("y"))
		{
			
			System.out.println("Welcome to the Factorial Calculator App ");
			System.out.println("please enter an integer greater than zero and less than 10");
			int num = sc.nextInt();
			
			     if( num>0 && num <10)
			    {
			    	 long factorial = 1;
			    	 for(int i=1; i<=num; i++) 
			    	 {
			    		 
			    		 factorial*=i;
			    		 
			    	 }
			    System.out.println(" The factorial of " + num + "is:" + factorial );
			    }
			     else {
			    	 System.out.println(" Please enter a number between 1 1nd 9");
				
			         }
				
			System.out.println(" Do you want to continue ? (y/n) :");
			choice = sc.next();
				
			}
		    System.out.println(" Thank you for choosing our App");
			sc.close();
		}
		

	}


