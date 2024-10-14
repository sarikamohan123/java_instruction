package model;

import java.sql.Date;



public class Actor {
	//1. all instance variables are private(encapsulation)
		private int id;
		private String firstName;
		private String lastName;
		private String gender;
		private Date birthdate;
		
		
 // 2a. Fully Loaded constructor
		public Actor(int id, String firstName, String lastName, String gender, Date birthdate) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.birthdate = birthdate;
		}

// 2b. Default Constructor
		
		public Actor() {
			super();
		}
		
	//2c.*
		public Actor(String firstName, String lastName, String gender, Date birthdate) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.birthdate = birthdate;
		}
		
// 3. Need getters/setters for all instance variables

		public int getId() {
			return id;
		}

		

		public void setId(int id) {
			this.id = id;
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

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Date getBirthdate() {
			return birthdate;
		}

		public void setBirthdate(Date birthdate) {
			this.birthdate = birthdate;
		}
		
		
//4. (optional) Generate a toString()- useful for Console apps
		@Override
		public String toString() {
			return "Actor [id=" + id + ", firstName=" + firstName + ", lastNAme=" + lastName + ", gender=" + gender + ", birthday="
					+ birthdate + "]";
		}
		
		
		
		
		
		
		
		
		

}
