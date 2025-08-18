import java.util.*;
class PremiumMax
{
	static String userName;
	static String email;
	static String contact;
	static String address;
	static String password;

	static ArrayList<String> cart =new ArrayList<>();
    static double toatalBill;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner ( System.in);
		outerLoop : 
		for (; ; ) 
		{
			 System.out.println();
			 System.out.println("    **** WELCOME **** ");
			 System.out.println();
			 System.out.println("1.NEW USER");
			 System.out.println("2.LOGIN");
			 System.out.println();
			 System.out.print("ENTER THE OPTION : ");
			 int opt = sc.nextInt();
			 System.out.println();

			 switch (opt) {
			 case 1 -> newUser();
			 case 2 -> login();
			 default -> System.out.println("Invalid Option");
			 	
			 };
		}
	}
	public static void newUser() 
	{
		System.out.println();
		System.out.print(" Enter the Username : ");
		userName=new Scanner(System.in).nextLine();
		System.out.print(" Enter the Email : ");
		email=new Scanner(System.in).next();
		System.out.print(" Enter the Contact : ");
		contact=new Scanner(System.in).next();
		System.out.print(" Enter the Address : ");
		address=new Scanner(System.in).nextLine();
		System.out.print(" Enter the Password : ");
		password=new Scanner(System.in).next();
		System.out.println();
		System.out.println(" ACCOUNT CTREATED SUCCESSFULLY"+(char)3);
		System.out.println();
	}
	public static void login() 
	{
		if (userName==null) 
		{
			System.out.println("Create A Account first ");
			return;	
		}
		System.out.println("  ** LOGIN  ** ");
		for (int i=1,attempt=3;i<=3;i++,attempt-- ) 
		{
		System.out.print("Enter the Email/PhoneNO :");
		String cred1=new Scanner(System.in).next();
		System.out.print("Enter the Password :");
		String cred2=new Scanner(System.in).next();

		if (cred1.equals(userName) || cred1.equals(contact) && cred2.equals(password)) 
		{
			homePage();
			return;
		}
		System.out.println("Wrong Credentials , Attempt Left : "+(attempt-1));
	    }
	    System.out.println();
	    System.out.println("3 Attempt Done ");
	    System.out.println(" you seem to a Different User ");
	    System.out.println("Thank you & never Visit Again ");	
   }
   public static void homePage() 
   {
   	for (; ; ) 
   	{
   		System.out.println();
   		System.out.println(" *** HOME PAGE **");
   		System.out.println("");
   		System.out.println("Shop By Categories");
   		System.out.println("1.Men");
   		System.out.println("2.Women");
   		System.out.println("3.View Cart");
   		System.out.println("4.WishList");
   		System.out.println("5.Order");
   		System.out.println("6.Logout");
   		System.out.print(" Enter the option : ");
   		int opt = new Scanner(System.in).nextInt();
   		switch (opt) 
   		{
   		case 1 -> shopMen();
   		case 2 -> shopWomen();	
   		case 3 -> viewCart();	
   		case 4 -> wishList();	
   		case 5 -> order();	
   		case 6 -> {
   			System.out.println(" Thank you Vist Again");
   			System.exit(0);
   		}	
   		default -> System.out.println(" Invalid Option ");	
   		};
   	}
   }
   public static void shopMen()
   {
      for (; ; ) 
      {
      	System.out.println();
      	System.out.println(" MEN SECTION ");
      	System.out.println();
      	System.out.println("1. Clothes");
      	System.out.println("2. Footwear");
      	System.out.println("3. Accessaries");
      	System.out.println("4. HomePage /n");
      	System.out.print("Enter the Option : ");
      	int opt = new Scanner(System.in).nextInt();
      	switch (opt) 
      	{
      	   case 1 -> clothes();
      	   case 2 -> footwear();	
      	   case 3 -> accesories();	
      	   case 4 -> homePage();	
      	   default -> System.out.println("Invalid Option ");	
      	};
      }
   }
   public static void clothes()
   {
   	for (; ; ) 
   	{
   		System.out.println("\n  CLOTHES   \n");
   		System.out.println("101. Shirt  -799/-");
   		System.out.println("102. Shirt  -699/-");
   		System.out.println("103. Jeans  -999/-");
   		System.out.println("100. Back ");
   		System.out.print("Enter The  Product ID : ");
   		int prodId = new Scanner(System.in).nextInt();
   		switch (prodId) {
      	   case 101 ->addCart(" 101 : Shirt  -799",799);
      	   case 102 -> addCart(" 101 : T-Shirt  -699",699);
      	   case 103 -> addCart(" 103 : Jeans  -999",999);
      	   case 100 -> shopMen();
      	   default -> System.out.println("Invalid option ");	
   		};

   	}
   }
   public static void footwear()
   {
   		for (; ; ) 
   	{
   		System.out.println("\n  FOOTWEAR   \n");
   		System.out.println("104. FlipFlop  -499/-");
   		System.out.println("105. Shoes  -999/-");
   		System.out.println("106. Crocs  -1999/-");
   		System.out.println("100. Back ");
   		System.out.print("Enter The  Product ID : ");
   		int prodId = new Scanner(System.in).nextInt();
   		switch (prodId) {
      	   case 104 ->addCart(" 104 : FlipFlop  -499",499);
      	   case 105 -> addCart(" 105 : Shoes  -999",999);
      	   case 106 -> addCart(" 106 : Crocs  -1999",1999);
      	   case 100 -> shopMen();
      	   default -> System.out.println("Invalid option ");	
   		};

   	}
   }
   public static void accesories()
   {
   		for (; ; ) 
   	{
   		System.out.println("\n  CLOTHES   \n");
   		System.out.println("107 : Spects  -499/-");
   		System.out.println("108 : Belt  -399/-");
   		System.out.println("109 : Cap  -299/-");
   		System.out.println("100 : Back ");
   		System.out.print("Enter The  Product ID : ");
   		int prodId = new Scanner(System.in).nextInt();
   		switch (prodId) {
      	   case 107 ->addCart(" 107 : Spects  -499",499);
      	   case 108 -> addCart(" 108 : Belt  -399",399);
      	   case 109 -> addCart(" 109 : Cap  -199",299);
      	   case 100 -> shopMen();
      	   default -> System.out.println("Invalid option ");	
   		};

   	}
   }
   public static void shopWomen()
   {
   		/*for (; ; ) 
      {
      	System.out.println();
      	System.out.println(" WOMEN SECTION ");
      	System.out.println();
      	System.out.println("1. Clothes");
      	System.out.println("2. Footwear");
      	System.out.println("3. Accessaries");
      	System.out.println("4. HomePage /n");
      	System.out.print("Enter the Option : ");
      	int opt = new Scanner(System.in).nextInt();
      	switch (opt) 
      	{
      	   case 1 -> clothes();
      	   case 2 -> footwear();	
      	   case 3 -> accesories();	
      	   case 4 -> homePage();	
      	   default -> System.out.println("Invalid Option ");	
      	};
      }*/
   }
   public static void addCart(String item,double price)
   {
   	System.out.println();
   	cart.add(item);
   	toatalBill+=price;
   	System.out.println("\n Product Inside Cart Is added succesfully ");
   }
   public static void viewCart()
   {
   	System.out.println();
   	System.out.println("** CART **");
   	if (cart.size()==0) 
   	{
   		System.out.println("\n Cart is Empty \n ");
   		return;
   	}
   	System.out.println(" Item in Cart");
   	for (String item:cart ) 
   	{
   		System.out.println(item);
   	}
   	System.out.println("Total Bill : "+toatalBill+"rs");

   	System.out.println(" do you want to remove the product from cart  Yes/No");
   	String response=new Scanner(System.in).next();
   	if (response.equalsIgnoreCase("YES")) {

   		System.out.print("enter the product id : ");
   		int prodId=new Scanner(System.in).nextInt();

   		if (removeProductCart(prodId)) {
   			System.out.println("Product Removed ");
   			
   		}
   		else{
   			System.out.println("Product not found");
   		}
   		
   	}
   }
   public static boolean removeProductCart(int prodId)
   {
      return true;
   }
   public static void wishList()
   {
   	System.out.println();
   	System.out.println(" **  WISHLIST **");
   }
   public static void order()
   {
   	System.out.println();
   	System.out.println(" ** Order **");
   }
}