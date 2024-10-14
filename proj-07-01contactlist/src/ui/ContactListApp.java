package ui;

import java.util.ArrayList;
import java.util.Arrays;

import model.Contact;
import util.Console;

public class ContactListApp {

	public static void main(String[] args) {
		Console.printLine(" Welcome to the contact list application");
		
		String continueLoop = "y";
		while (continueLoop.equalsIgnoreCase("y")) {
			// Create a new contact object
			Contact contact =new Contact();
			//Get User input
			String firstName = Console.getRequiredString("Enter first name : ");
			String LastName = Console.getRequiredString("Enter Last name : ");
			String email = Console.getString("email");
			String phone =Console.getString("phone:");
			
			// Set the values into the object 
			contact.setFirstName(firstName);
			contact.setLastName(LastName);
			contact.setEmail(email);
			contact.setPhone(phone);
			
			//Display contact information
			Console.printLine(contact.displayContact());
			continueLoop =Console.getString("Another movie? (y/n)", new ArrayList<>(Arrays.asList("y", "n")));
			
			
		}
		
		Console.printLine(" Bye");


	}

}
