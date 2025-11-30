import java.util.Scanner;

class DatabaseConnection {

	private final String DB_USER;
	private final String DB_PASSWORD;

	private static DatabaseConnection obj; // null

	private DatabaseConnection() {
		super();
	}

	{

		this.DB_USER = System.getenv("dbUser");
		this.DB_PASSWORD = System.getenv("dbPass");
	}

	public static DatabaseConnection getInstance() {
		if (obj != null) {
			return obj;
		}
		obj = new DatabaseConnection();
		return obj;
	}

	public void getConnection(String url, String DB_USER, String DB_PASSWORD) {
		if (this.DB_USER.equals(DB_USER) && this.DB_PASSWORD.equals(DB_PASSWORD)) {
			System.out.println("databse connection succesfully");
		} else {
			System.out.println("failed to connect with the databasse");
		}
	}

}

class AccountUser {

	String name;
	String username;
	String password;
	String email;
	Long contact;

	AccountUser(String name, String username, String password, String email, Long contact) {

		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;

	}

	public void displayUserAccount() {
		System.out.println("********USER INFO ************");
		System.out.println("Name : " + name);
		System.out.println("UserName :" + username);
		System.out.println("Contact : " + contact);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
	}
}

class Instagram {

	AccountUser user; // null
	boolean flag = false;

	// db connection build , non static block initialsed intially
	{

		DatabaseConnection obj1 = DatabaseConnection.getInstance();
		final String DATA_BASE_NAME = System.getenv("dbUser");
		String url = "jdbc:mysql://localhost:3306/testdb" + DATA_BASE_NAME;
		String dbUser = "user";
		String dbPass = "pass";
		obj1.getConnection(url, dbUser, dbPass);

	}

	public void launchApplication() {
		for (;;) {

			System.out.println(" Welcome to Instagram ");
			System.out.println("1 Login ");
			System.out.println("2 Create Account ");
			System.out.println("3 Exit ");
			System.out.println("Enter your opt : ");
			int opt = new Scanner(System.in).nextInt();

			switch (opt) {
				case 1 -> login();
				case 2 -> createAccount();
				case 3 -> System.exit(0);
				default -> System.out.println("INVALID OPTION");
			}
		}
	}

	public void login() {
		System.out.println("LOGIN MODOULE");
		if (user == null) {
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return;
		}
		System.out.println("\n LOGIN MODULE ");
		// bypass login method
		if (flag) {
			features();
		}

		System.out.println("Usernaem : ");
		String username = new Scanner(System.in).nextLine();
		System.out.println("Password : ");
		String password = new Scanner(System.in).next();

		if (username.equals(user.username) && password.equals(user.password)) {
			System.out.println("LOGIN SUCCESSFULLY !");
			System.out.println("Do you wanted to save an credentials ? y/n");
			String resp = new Scanner(System.in).nextLine();
			if (resp.equals("y")) {
				flag = true;
			}
			features();
		} else {
			System.out.println("INVALID CREDENTIALS");
		}
	}

	public void createAccount() {
		if (user != null) {
			System.out.println("ACCOUNT ALREADY EXIST !");
			login();
		}

		System.out.println(" CREATE ACCOUNT MODULE ");
		System.out.println("Username : ");
		String name = new Scanner(System.in).nextLine();

		System.out.println("PASSWORD ");
		String password = new Scanner(System.in).next();

		System.out.println("Email :");
		String email = new Scanner(System.in).next();

		System.out.println("Contact :");
		Long contact = new Scanner(System.in).nextLong();

		user = new AccountUser(name, name, password, email, contact);
		saveUserInfo(user);

	}

	void features() {
		for (;;) {
			System.out.println("FEATURES MODULE ");
			// System.out.println("1. Add Friend ");
			// System.out.println("2. Search Friend ");
			// System.out.println("3. Block Friend ");
			System.out.println("4. Profile ");
			System.out.println("5 Logout ");

			System.out.println("Enter your responce ");
			int opt = new Scanner(System.in).nextInt();

			switch (opt) {
				// case 1 -> addFriend();
				// case 2 -> SearchFriend();
				// case 3 -> blockFriend();
				case 4 -> profile();
				case 5 -> logOut();
				default -> System.out.println("invalid option");
			}
		}
	}

	public void addFriend() {
		System.out.println("ADD FRIEND MODULE");
	}

	public void blockFriend() {
		System.out.println("Block Friend MODULE");
	}

	public void searchFriend() {
		System.out.println("Search Friend MODULE");
	}

	public void logOut() {
		System.out.println("logout MODULE");
		launchApplication();
	}

	public void profile() {
		System.out.println("Profile MODULE");
		user.displayUserAccount();
	}

	public void saveUserInfo(AccountUser obj) {
		System.out.println("USER INFO SAVED ");
	}

}

public class InstagramDriver {
	public static void main(String[] args) {
		Instagram instagram = new Instagram();
		instagram.launchApplication();
	}
}