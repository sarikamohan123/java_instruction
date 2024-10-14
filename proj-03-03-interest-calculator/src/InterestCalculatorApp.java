import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String choice ="y";
		 
		 // NumberFormat instances for currency and percentage formatting
		 NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		 NumberFormat percentFormat = NumberFormat.getPercentInstance();
		 percentFormat.setMinimumFractionDigits(3); //Set percentage to three decimal places 
		 while( choice.equalsIgnoreCase("y"))
		 {
			 System.out.print(" Enter the loan amount:  ");
			 double loanAmount = sc.nextDouble();
			 System.out.print(" Enter the interest rate:  ");
			 double interestRate = sc.nextDouble();
			 
			 //Calculate interest
			 double interest =loanAmount * interestRate ;
			 
			 //Format and display the loan amount , interest rate, and interest
			 System.out.println();
			 System.out.println(" Loan Amount:        " +  currencyFormat.format(loanAmount));
			 System.out.println(" Interest Rate:      " +  percentFormat.format(interestRate));
			 System.out.println(" Interest:           " +  currencyFormat.format(interest));
			 //Ask if user wants to continue
			 System.out.print("Do you want to continue? (y/n):  ");
			 choice = sc.next();
			 System.out.println();
			 
		 }
		 System.out.println(" Thank you for using our App");
	}
			 
	
}
