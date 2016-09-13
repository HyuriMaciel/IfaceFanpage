package testes.guilherme_login_system;

public class User {
	
		// ATRIBUTES
		
		// User information

		public long uniqueID;

		public String username;

		public String password;

		public String full_name;
		
		public String email;

		public int active = 1;


		// METHODS
		
		public long getUniqueID() {
			return uniqueID;
		}

		public void setUniqueID() {
			long minNumber = 1;
			long maxNumber = 1000000;

			// Generates a random number between 1 and 1000000
			this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
			
			// TO DO - Change this. It have to check the last id on the database, then increment.

			System.out.println("    Unique ID set to: " + this.uniqueID);
		}

		public String getUsername() {
			return username;
		}

		public void   setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void   setPassword(String password) {
			this.password = password;
		}

		public String getFull_name() {
			return full_name;
		}

		public void   setFull_name(String first_name) {
			this.full_name = first_name;
		}
		
		public String getEmail() {
			return email;
		}

		public void   setEmail(String email) {
			this.email = email;
		}

		public int    getActive() {
			return active;
		}

		public void  setActive(int active) {
			this.active = active;
		}
		
		// Print user info
		
		public void printUserObjectAttributes() {
			System.out.print("\n USER INFO\n\n" + "    uniqueID:  " + uniqueID + "\n" 
												+ "    username:  " + username + "\n" 
												+ "    password:  " + password + "\n"
												+ "    full_name: " + full_name + "\n"
												+ "    email:     " + email + "\n"
												+ "    active:    " + active + "\n\n");
		}

}
