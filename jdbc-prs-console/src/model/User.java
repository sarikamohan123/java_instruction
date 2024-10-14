package model;

public class User {
	
		//1. all instance variables are private(encapsulation)
		
		private int id;
		private String userName;
		private String passWord;
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String email;
		private boolean reviewer;
		private boolean admin;
		
		
		
		
		// 2a. Fully loaded constructor 
				
		public User(int id, String userName, String passWord, String firstName, String lastName, String phoneNumber,
				String email, boolean reviewer, boolean admin) {
			super();
			this.id = id;
			this.userName = userName;
			this.passWord = passWord;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.reviewer = reviewer;
			this.admin = admin;
		}


//Empty Constructor

		public User() {
			super();
		}

		
		// 3. Need getters/setters for all instance variables-Right click-->source-->Generate getter and setters for all field
			

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getPassWord() {
			return passWord;
		}


		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}


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


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public boolean isReviewer() {
			return reviewer;
		}


		public void setReviewer(boolean reviewer) {
			this.reviewer = reviewer;
		}


		public boolean isAdmin() {
			return admin;
		}


		public void setAdmin(boolean admin) {
			this.admin = admin;
		}
		
		
		// 
		
		public User(String userName, String passWord, String firstName, String lastName, String phoneNumber,
				String email, boolean reviewer, boolean admin) {
			super();
			this.userName = userName;
			this.passWord = passWord;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.reviewer = reviewer;
			this.admin = admin;
		}


		//4. (optional) Generate a toString()- useful for Console apps
		
		@Override
		public String toString() {
			return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", reviewer="
					+ reviewer + ", admin=" + admin + "]";
		}
		
		
		
		
		
		
		
		

}
