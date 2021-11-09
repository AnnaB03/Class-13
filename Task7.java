package syntax.class13;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
	/* Accept username, password and confirm password from a user and check following requirements:
//Username and Password cannot be  empty, if so message=”Username and Password cannot be empty”.
//Password should be minimum 8 characters, if less  message=”Password is too short”.
//Password cannot contain username if so,  message=”Password cannot contain username”.
//Password should match confirmed password, if not   message=“Passwords do not match”.
//Only after all requirements met  message “Your username and password has been created”
	 */

		

	Scanner scan = new Scanner (System.in);
	System.out.println("Please create a username");
	String username = scan.nextLine();
	System.out.println("Please create a password that contains not less than 8 characters");
	String password = scan.nextLine();
	System.out.println("Please confirm your password");
	String passwordMatch = scan.nextLine();
	
	if (!(username.isEmpty() || password.isEmpty())) {
	if (password.length()>=8) {
		if (!password.contains(username)) {
			if (password.equals(passwordMatch)) {
				System.out.println("Your username and password have been created");
			} else {
				System.out.println("Passwords do not match");
			} } else { 
				System.out.println("Password cannot contain username");
			} } else {
				System.out.println("Password is too short");
			} } else {
				System.out.println("Username and password cannot be empty");
			
			
		}
	}
		
	
	}
	