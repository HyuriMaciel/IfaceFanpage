package testes.guilherme_login_system;

import java.util.Scanner;

public class Menu {
	
	public static int isItLogIn = 0;

	public int isItUserFound = 0;

	public static int isItExit = 0;
	
	public User menuUser = new User();
	public Login_Sign_up menuLogin_Sign_up = new Login_Sign_up();

	///////////////////////////////////////////////

	private Scanner input = new Scanner(System.in);

	///////////////////////////////////////////////

	public void display() {
		System.out.print("\n This is the FRONT PAGE page \n");
		System.out.print("\n-- Actions --\n");
		System.out.println("Select an option: \n" + "  1) Login\n" + "  2) Sign up\n" + "  3) Exit \n");

		int selection = input.nextInt();
		input.nextLine();

		switch (selection) {
		case 1:
			// Call method login in Login_Sign_up
			System.out.println ("Sorry, not implemented yet.");
			
			if (isItUserFound == 1) {
				this.display2();
			}
			break;
		case 2:
			// Call method sign_up in Login_Sign_up
			
			menuUser = menuLogin_Sign_up.sign_up();
			menuUser.printUserObjectAttributes();
			
			this.display2();
			break;
		case 3:
			this.exit();
			break;
		default:
			System.out.println("Invalid selection.");
			break;
		}

	}

	private void exit() {
		System.out.println("Exiting...");
		System.exit(1);
	}

	///////////////////////////////////////

	public void display2() {

		display: while (true) {

			System.out.print("\n This is the USER PAGE page \n");
			System.out.printf("\n[ You are signed in as %s ]\n", menuUser.username);
			System.out.print("\n-- Actions --\n");
			System.out.println("Select an option: \n" + "  1) Account\n" + "  2) Friends\n" + "  3) Messages\n"
					+ "  4) Files\n" + "  5) Log out and go back to FRONT PAGE\n");
			int selection = input.nextInt();
			input.nextLine();

			switch (selection) {
			case 1:
				System.out.println("1 Account");
				//this.display3();
				break;
			case 2:
				System.out.println("2 Friends");
				//this.display4();
				break;
			case 3:
				System.out.println("3 Messages");
				//this.display5();
				break;
			case 4:
				System.out.println("4 Files");
				break;
			case 5:
				System.out.println("Logging out...");
				break display;
			default:
				System.out.println("Invalid action.");
				break;
			}
		}
	}				

}