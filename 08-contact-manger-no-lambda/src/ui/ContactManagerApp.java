package ui;

import java.util.ArrayList;
import java.util.List;

import model.Contact;
import util.Console;

public class ContactManagerApp {

	public static void main(String[] args) {
		Console.printLine("Welcome to Conatct Manager - no lambdas");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach",null,"800-231-4567"));
		contacts.add(new Contact("Anne Boehm",null,null));
		contacts.add(new Contact("Joel Murach","joel@murach.com",null));
		contacts.add(new Contact("Bubba Murach","bubba@murach.com","800-234-567"));
		displayContacts("All contacts:", contacts);
		
		//show contacts with no phone
		List<Contact> contactsNoPhone =filterContactsNoPhone(contacts);
		displayContacts("Contacts No Phone:" ,contactsNoPhone);
		
		
		//show with no email address
		List<Contact> contactsNoEmail =filterContactsNoEmail(contacts);
		
		displayContacts("Contacts No Email",contactsNoEmail);
		
		//show no contact with no phone nor email address
		List<Contact> contactsNoPhoneOrEmail =filterContactsNoPhoneOrEmail(contacts);
	
		displayContacts("Contacts No Phone or Email", contactsNoPhoneOrEmail);
		
	
		
		Console.printLine("Bye");
	}

	private static void displayContacts(String header,List<Contact> contactsNoPhone) {
		Console.printLine(header);
		for(Contact c: contactsNoPhone) {
			Console.printLine(c.toString());
		}
		Console.printLine("");
	}

	private static List<Contact> filterContactsNoPhoneOrEmail(List<Contact> contacts) {
		List<Contact> filteredContacts =new ArrayList<>();
		for(Contact c: contacts) {
		 if(c.getPhone() == null && c.getEmail() ==null)	{
			 filteredContacts.add(c);
		 }
		}
		
		return filteredContacts;
		
	}
	

	private static List<Contact> filterContactsNoEmail(List<Contact> contacts) {
		
		List<Contact> filteredContacts =new ArrayList<>();
		for(Contact c: contacts) {
		 if(c.getEmail() == null)	{
			 filteredContacts.add(c);
		 }
		}
		
		return filteredContacts;
	}
	

	private static List<Contact> filterContactsNoPhone(List<Contact> contacts) {
		
		List<Contact> filteredContacts =new ArrayList<>();
		for(Contact c: contacts) {
		 if(c.getPhone() == null)	{
			 filteredContacts.add(c);
		 }
		}
		
		return filteredContacts;
	}

	

}
