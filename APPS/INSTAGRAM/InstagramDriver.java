import java.util.Scanner;

class DatabaseConnection{
	private final String DATA_BASE_NAME;
	private final String DB_USER;
	private final String DB_PASSWORD;


	private static DatabaseConnection obj; // null

	private DatabaseConnection(){
		super();
	}

	{
		this.DATA_BASE_NAME = System.getenv("DB_NAME");
		this.DB_USER = System.getenv("dbUser");
		this.DB_PASSWORD = System.getenv("dbPass");
	}

	public static DatabaseConnection getInstance()
	{
		if(obj != null)
		{
			return obj;
		}
		obj = new DatabaseConnection();
		return obj;
	}

public void getConnection(String url,String DB_USER,String DB_PASSWORD)
{
	if(this.DB_USER.equals(DB_USER) && this.DB_PASSWORD.equals(DB_PASSWORD)){
		System.out.println("databse connection succesfully");
	}else{
		System.out.println("failed to connect with the databasse");
	}
}


}

class AccountUser{

String name;
String username;
String password;
String email;
Long contact;

AccountUser(String name,String username,String password,String email,Long contact){

	this.name = name;
	this.username = username;
	this.password = password;
	this.email = email;
	this.contact = contact;

}

public void displayUserAccount(){
	System.out.println("********USER INFO ************");
	System.out.println("Name : " + name);
	System.out.println("UserName :"+username);
	System.out.println("Contact : "+ contact);
	System.out.println("Email : "+email);
	System.out.println("Password : "+password);
}
}

class Instagram{

	 AccountUser user ; // null
	 boolean flag = false;

	//  db connection build
	 {

		DatabaseConnection obj1 = DatabaseConnection.getInstance();
		final String DATA_BASE_NAME = System.getenv("dbUser");
		String url = "jdbc:mysql://localhost:3306/testdb" + DATA_BASE_NAME;
		String dbUser = "scott";
		String dbPass = "tiger";
		obj1.getConnection(url, dbUser, dbPass);

	 }


	 public void launchApplication(){
		for (;;) {

			System.out.println(" Welcome to Instagram ");
			System.out.println("1 Login ");
			System.out.println("2 Create Account ");
			System.out.println("Enter your opt : ");
			int opt = new Scanner(System.in).nextInt();

			switch(opt){
				case 1 -> login();
				case 2 -> createAccount();
				default -> System.out.println("INVALID OPTION");
			}
		}
	 }


	 public void login(){
		System.out.println("LOGIN MODOULE");
		if(user == null){
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return;
		}
		System.out.println("\n LOGIN MODULE ");
		if(flag){
			features();
		}

	System.out.println("Usernaem : ");
	String username = new Scanner(System.in).nextLine();
	System.out.println("Password : ");
	String password = new Scanner(System.in).next();
	
	if(username.equals(user.username)&&password.equals(user.password)){
		System.out.println("LOGIN SUCCESSFULLY !");
		System.out.println("Do you wanted to save an credentials ? y/n");
		String resp = new Scanner(System.in).nextLine();
		if(resp.equals("y")){
			flag = true;
		}
	}


	 }

	 static void features(){

	 }

	 static void createAccount(){
		
	 }
	
}