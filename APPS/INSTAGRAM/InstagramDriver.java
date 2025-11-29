import java.util.Scanner;

class DatabaseConnection{
	private final Strign DATA_BASE_NAME;
	private final String DB_USER;
	private final DB_PASSWORD;


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
}
}

class Instagram{

	AccountUser user;

	String url = “jdbc:mysql://localhost:3306/testdb”;

	String DB_NAME = System.getenv("dbUser");
	String DB_PASS = System.getenv("dbPass");

	DatabaseConnection.getInstance(url,DB_USER,DB_PASS).getConnection();


}