package day45_Encapsulation_Practice;

import java.util.Random;

public class etsyAccount {


	
		private String email;
		private String firstName;
		private String password;
		
		// constructor 1 no args sets all as empty string
		public etsyAccount() {
			email = "";
			email = "";
			password = "";
			
		}
		// contructor 2. 
		// takes 3 args and sets them to instance variables using setters
		
		public etsyAccount(String email, String firstName, String password) {
			setEmail(email);
			setFirstName(firstName);
			setPassword(password);
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			//if it contains @ somewhere in the middle . assign it 
			// if not print "Please enter a valid email address.
			
			if(email.indexOf("@") > 0 && email.indexOf("@")  < email.length()-1 ) {
				
			this.email = email;
			}else { 
				System.out.println("Please enter a valid email address");
			}
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			// cant be blank
			// needs to be only alphabetic
			if(isValidFirstName(firstName)) {
				this.firstName =  firstName;
			}else {
				System.out.println("Your first name cannot contain characters");
			}
		}
		//valid ---> all letters can have space in middle
		// invalid ---> cannot contain numbers or any other chars and 
		// need to create another private method bc we only need it here in this class
		private boolean isValidFirstName(String firstName) {
			// check if firstName starts with or ends with space 
			// return false if true
			if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
				return false;
			}
			if(firstName.isEmpty()) {
				System.out.println("Cannot be blank");
				return false;
			}
			
			for(int i=0; i < firstName.length(); i++) {// reading one character at a time.
				char ch = firstName.charAt(i); 
				if(Character.isAlphabetic(ch)==false && ch != ' ') {
					return false;
				}
			}
			return true;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			if(password.length() <6) {
				System.out.println("must be at least 6 characters.");
				this.password = "";
			}else {
				this.password = password;
			}

		}
		
		/*constructor
		 * email, firstname --> call setter methods
		 * password is auto generated and assigned
		 */
		public etsyAccount(String email, String firstName) {
			setEmail(email);
			setFirstName(firstName);
			this.password = getRandomPassword(); // random, password with 6 chars
		}
		
		private String getRandomPassword() {
			Random rd = new Random();
			String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
			String rdPassword = "";
			for(int i=1; i<=6; i++) {
				rdPassword += letters.charAt(rd.nextInt(letters.length()));
			}
			return rdPassword;
			
		}
		
		public String toString() {
			return "etsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
		}

	}

