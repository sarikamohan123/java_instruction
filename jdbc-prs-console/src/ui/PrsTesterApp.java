package ui;

import java.util.List;

import db.UserDB;
import db.VendorDB;
import model.User;
import model.Vendor;
import util.Console;

public class PrsTesterApp {

	public static void main(String[] args) {

		Console.printLine("Welcome to the PrsDdb Tester App !");

		Console.printLine("List all Users");
		Console.printLine("=====================");
		listUsers();

		Console.printLine("List all Vendors");
		Console.printLine("=====================");
		listVendors();

		// Add a vendor

		Console.printLine("Add a Vendor");
		Console.printLine("=====================");
		String code = Console.getRequiredString("Code :");
		String name = Console.getRequiredString("Name :");
		String address = Console.getRequiredString("Address : ");
		String city = Console.getRequiredString("City:");
		String state = Console.getRequiredString("State:");
		String zip = Console.getRequiredString("Zip:");
		String phoneNumber = Console.getRequiredString("PhoneNumber :");
		String email = Console.getRequiredString("Email:");

		Vendor v = new Vendor(code, name, address, city, state, zip, phoneNumber, email);
		if (VendorDB.add(v)) {
			Console.printLine("Vendor added");
		} else {
			Console.printLine("Error adding Vendor");
		}

		Console.printLine("List all Vendors:");
		Console.printLine("=====================");
		listVendors();

		// Get an vendor by id

		Console.printLine("Find an Vendor by id");
		Console.printLine("=====================");
		int id = Console.getInt("Vendor Id: ");
		v = VendorDB.get(id);
		if (v != null) {
			Console.printLine(v.toString());
		} else {
			Console.printLine("No vendor found for id: " + id);
		}

		Console.printLine("List all Vendors:");
		Console.printLine("=====================");
		listVendors();
		
		
		// Delete vendor by id 
        Console.printLine("Delete  user by id:");
        Console.printLine("=====================");

          id = Console.getInt("Vendor Id: ");

           v = VendorDB.get(id);

           if (v != null) {

                     if (VendorDB.delete(id)) {

                   Console.printLine("Vendor deleted.");

               } else {

           Console.printLine("Error deleting Vendor.");

            }

          } else {

        Console.printLine("No vendor found for id: " + id + ". Cannot delete.");

         }

          Console.printLine("List all vendors"); 
           listVendors();




		/*
		 * // Add an User
		 * 
		 * Console.printLine("Add an User"); Console.printLine("=====================");
		 * String userName = Console.getRequiredString("UserName :"); String passWord =
		 * Console.getRequiredString("PassWord :"); String firstName
		 * =Console.getRequiredString("FirstName : "); String lastName
		 * =Console.getRequiredString("LastName:"); String phoneNumber =
		 * Console.getRequiredString("PhoneNumber :"); String email =
		 * Console.getRequiredString("Email:"); String reviewerInput =
		 * Console.getRequiredString("Reviewer (y/n): "); Boolean reviewer =
		 * reviewerInput.equalsIgnoreCase("y") || reviewerInput.equalsIgnoreCase("yes");
		 * String adminInput = Console.getRequiredString("Admin (y/n): "); Boolean admin
		 * = adminInput.equalsIgnoreCase("y") || adminInput.equalsIgnoreCase("yes");
		 * User u = new User (userName, passWord,
		 * firstName,lastName,email,phoneNumber,reviewer,admin ); if(UserDB.add(u)) {
		 * Console.printLine("User added"); } else {
		 * Console.printLine("Error adding User"); }
		 * 
		 * 
		 * 
		 * Console.printLine("List all Users:");
		 * Console.printLine("====================="); listUsers();
		 * 
		 * // Get an user by id
		 * 
		 * Console.printLine("Find an User by id");
		 * Console.printLine("====================="); int id
		 * =Console.getInt("User Id: "); u = UserDB.get(id); if (u != null) {
		 * Console.printLine(u.toString()); }else {
		 * Console.printLine("No user found for id: " +id); }
		 * 
		 * Console.printLine("List all Users:");
		 * Console.printLine("====================="); listUsers();
		 * 
		 * 
		 * // Delete user by id Console.printLine("Delete  user by id:");
		 * Console.printLine("=====================");
		 * 
		 * id = Console.getInt("User Id: ");
		 * 
		 * u = UserDB.get(id);
		 * 
		 * if (u != null) {
		 * 
		 * if (UserDB.delete(id)) {
		 * 
		 * Console.printLine("User deleted.");
		 * 
		 * } else {
		 * 
		 * Console.printLine("Error deleting User.");
		 * 
		 * }
		 * 
		 * } else {
		 * 
		 * Console.printLine("No user found for id: " + id + ". Cannot delete.");
		 * 
		 * }
		 * 
		 * Console.printLine("List all users"); listUsers();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

	private static void listUsers() {
		List<User> users = UserDB.getAll();
		for (User u : users) {
			Console.printLine(u.toString());
		}

	}

	private static void listVendors() {
		List<Vendor> vendors = VendorDB.getAll();
		for (Vendor v : vendors) {
			Console.printLine(v.toString());
		}

	}
}
