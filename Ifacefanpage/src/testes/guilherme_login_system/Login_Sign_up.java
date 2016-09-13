package testes.guilherme_login_system;

import java.util.Scanner;

public class Login_Sign_up {
	
	private Scanner input = new Scanner(System.in);
	
	private String username, password, full_name, email;
	
	User theUser = new User();
	
	// METHHODS
	
	public User log_in() {

		System.out.print("\n This is the LOG IN page \n");

		System.out.print("\n    Enter your username: \n");

		if (input.hasNextLine()) {

			username = input.nextLine();
		}

		System.out.print("\n    Enter your password: \n");

		if (input.hasNextLine()) {

			password = input.nextLine();
		}
			    
	    theUser.setUsername(username);
	    theUser.setPassword(password);
	    
	    return theUser;
}
	
	public User sign_up() {

		System.out.print("\n This is the SIGN UP page \n");

		System.out.print("\n    Enter your username: \n");

		if (input.hasNextLine()) {

			username = input.nextLine();
		}

		System.out.print("\n    Enter your password: \n");

		if (input.hasNextLine()) {

			password = input.nextLine();
		}
		
		System.out.print("\n    Enter your e-mail: \n");

		if (input.hasNextLine()) {

			email = input.nextLine();
		}

		System.out.print("\n    Enter your full name: \n");

		if (input.hasNextLine()) {

			full_name = input.nextLine();

		}
		
		theUser.setUniqueID();
		theUser.setUsername(username);
		theUser.setPassword(password);
		theUser.setEmail(email);
		theUser.setFull_name(full_name);
	    
	    
	    return theUser;
	}

}
