package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import model.Contact;
import util.Console;

public class ContactManagerApp {

	public static void main(String[] args) {
		
		Console.printLine("Welcome to Contact Manager-No Lambdas");
		
		List<Contact> contacts =new ArrayList<>();
		contacts.add(new Contact("Mike Murach",null,"800-221-5528"));
		contacts.add(new Contact("Anne Boehm ",null,null));
		contacts.add(new Contact("Joel Murach","joel@murach.com",null));
		contacts.add(new Contact("Bubba Murach","bubba@murach.com","784-888-7856"));
		displayContacts(" All contacts:" contacts);
		
		//show contacts with no phone
		
		List<Contact> contactsNoPhone = filterContactsNoPhone(contacts);
		extracted(contactsNoPhone);
		
		
		//show contacts with no email address
		List<Contact> contactsNoEmail = filterContactsNoEmail(contacts);
		displaycontacts("Contacts No Email:", contactsNoEmail);
		//show contacts with no phone nor email
		List<Contact> contactsNoPhoneOrEmail = filterContactsNoPhoneorEmail(contacts);
		for (Contact c:contacts) {
			if(c.getPhone()== null) {
				
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}
	
	
	//Function Interface
	c->{
		String phone =(c.getPhone() == null)? "n/a" : c.getPhone();
		return c.getName() + ": " +phone;
	});
	
	for (String s: contactPhoneNumbers) {
	}
	Console.printLine()
	

	private static void extracted(String header,List<Contact> contactsNoPhone) {
		Console.printLine("Contacts no phone");
		for (Contact c: contactsNoPhone) {
			Console.printLine(c.toString());
		}
		Console.printLine("");
	}

	private static List<Contact> filterContactsNoPhoneorEmail(List<Contact> contacts) {
		List<Contact> filteredContacts =new ArrayList<>();
		for (Contact c:contacts) {
			if (c.getPhone() == null  && c.getEmail() == null) {
				
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

	private static List<Contact> filterContactsNoEmail(List<Contact> contacts) {
		List<Contact> filteredContacts =new ArrayList<>();
		for (Contact c:contacts) {
			if (c.getEmail() == null) {
				filteredContacts.add(c);
			}
		}
		  return filteredContacts;
	}

	
	
	private static List<Contact> filterContactsNoPhone(List<Contact> contacts) {
		List<Contact> filteredContacts =new ArrayList<>();
		for(Contact c:contacts) {
			if(c.getPhone() == null) {
				filteredContacts.add(c);
			}
			
			
		}
		return filteredContacts;
	}
	
	//process contacts ,accept a contact and do something
	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		for (Contact c: contacts) {
			consumer.accept(c);
		}
	}
     private static List<String> transformContacts(List<Contact>contacts,Function<Contact,String> function);
      List <String> strings =new ArrayList<>();
      for (Contact c:contacts) {
    	  strings.add(function.apply(c));
      }
      return strings;
      }
}
