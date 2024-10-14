import java.util.Scanner;

public class RectangleCalcultor {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println(" Welcome to the Rectangle Calculator");
		
		String choice ="y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println(" Enter length");
			double length =scanner.nextDouble();
			System.out.println(" Enter width");
			double width =scanner.nextDouble();
			
			//Calculate Area and Perimeter
			double area = length * width;
			double perimeter = 2 *(length + width);
			
			//Output
			System.out.println("Area is :" + area);
			System.out.println("Perimeter is :" + perimeter);
			
		//Ask user if they want to continue
			System.out.println(" Continue? (y/n):");
			choice =scanner.next();
			System.out.println();
			
		}
		System.out.println(" Thank you for using the rectangle perimeter");
		scanner.close();
		
		
		}

}
