import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		String choice = "y";
		System.out.println(" Welcome to the letter grade converter");
		
		//Loop until the user choose not to continue
		while( choice.equalsIgnoreCase("y")) {
			// Input the number grade
			System.out.println(" Enter numerical grade:");
			int numericalGrade =scanner.nextInt();
			scanner.nextLine();//Consume the leftover newline
			//Convert numerical grade to letter grade
			String letterGrade;
			if( numericalGrade >= 90) {
				letterGrade ="A";}
			else if(numericalGrade >=80) {
				letterGrade ="B";}
			else if(numericalGrade >=70) {
				letterGrade ="C";}
			else if(numericalGrade >=60) {
				letterGrade ="D";}
			else {
				letterGrade ="F";
			}
			
			//Output the letter Grade
			System.out.println(" Letter grade :" +letterGrade);
			//Prompt the user to continue or not
			System.out.println(" Do you want to Continue? (y/n):");
			choice = scanner.nextLine();
		
				
			
		}
		System.out.println(" Bye");
		scanner.close();
	}

}
