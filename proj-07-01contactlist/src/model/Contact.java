package model;

public class Contact {
	
		//1. all instance variables are private(encapsulation)
		private String firstName;
		private String lastName;
		private String email;
		private String phone;
		
		
		
	// 2a. Fully loaded constructor
		// Generate fully loaded  constructor - right click  on screen->source->Generate Constructor using field-> select all fields-> generate
		
		public Contact(String firstName, String lastName, String email, String phone) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phone = phone;
		}

		
		
		
	//2b.  Need a default /empty constructor
		// Generate default constructor  right click  on screen->source->Generate Constructors using field-> deselect all fields-> generate
		public Contact() {
			super();
		}


		// 3. Need getters/setters for all instance variables
		// Generate getter/ settersMethod- right click  on screen->source->Generate getter and setters

		public String getFirstName() {
			return firstName;
		}




		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}




		public String getLastName() {
			return lastName;
		}




		public void setLastName(String lastName) {
			this.lastName = lastName;
		}




		public String getEmail() {
			return email;
		}




		public void setEmail(String email) {
			this.email = email;
		}




		public String getPhone() {
			return phone;
		}




		public void setPhone(String phone) {
			this.phone = phone;
		}


//  Generate ToString Method- right click  on screen->source->Generate toString code

		@Override
		public String toString() {
			return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone="
					+ phone + "]";
		}

		//Method to display contact details
		public String displayContact() {
			return "-------------------------------------\n"
				+ "----Currrent Contact------------------\n"
				+"----------------------------------------\n"
				+ "Name:            " + this.firstName +" " + this.lastName +"\n"
				+"Email Address: " + this.email + "\n"
				+"Phone Number:  " + this.phone + "\n"
				+"----------------------------------------";
			
		}
		
		
		
		
}
		
		
		
		


		

		