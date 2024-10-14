package ui;

import java.util.Scanner;

public class ScannerOverloadApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Read an entire line...");
		String line = sc.nextLine();
		System.out.println(line);
		
		System.out.println("Read an Int..");
		int nbr1 = sc.nextInt();
		System.out.println(nbr1);
		
		System.out.println("Read a double..");
		double db11 = sc.nextDouble();
		System.out.println(db11);
		
		System.out.println("Scan using next() on along string....");
		System.out.println(" Enter a song lyric");
		StringBuilder sb =new StringBuilder();
		Scanner lyric =new Scanner("She wore rasesberry  berert!")
		while (lyric.hasNext()) {
			sb.append(lyric.next());
			
			
		}
		
		System.out.println("sb =" +sb);
		
		
	}

}
