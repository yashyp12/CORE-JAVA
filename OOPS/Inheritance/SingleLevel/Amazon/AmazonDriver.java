package Inheritance.SingleLevel.Amazon;

class Amazon {

    private String username;
    private String email;
    private String password;
    private Long contact;
    private String gender;
    private String address;

    public Amazon(String username, String email, String password, Long contact, String gender, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.gender = gender;
        this.address = address;
    }

    public void getAmazonInfo() {
        System.out.println("AMAZON DETAILS");
        System.out.println("USERNAME " + username);
        System.out.println("Email " + email);
        System.out.println("Contact  " + contact);
        System.out.println("Address " + address);
    }

}

//class AmazonPrime extends
class AmazonPrime extends Amazon {

    private String[] profiles;
    private String password;
    private String sub;
    private double price;
    private int users;

    AmazonPrime(String sub, double price, int users, String[] profiles,
                String username, String email, String password, Long contact, String gender, String address) {
        super(username, email, password, contact, gender, address);

        this.password = password;
        this.sub = sub;
        this.price = price;
        this.users = users;
        this.profiles = profiles;
    }

    public void getAmazonPrimeInfo() {
        getAmazonInfo();
        System.out.println("PROFILES ");
        for (String profile : profiles) {
            System.out.println(profile);
        }

        System.out.println("Subscription Type " + sub);
        System.out.println("Price : " + price);
        System.out.println("Users : " + users);

    }
}

public class AmazonDriver {

    public static void main(String[] args) {

        String[] profiles = {"USER1", "USER2", "USER3"};
        AmazonPrime obj1 = new AmazonPrime("PRIME-SUBSCRIPTION", 399, 3, profiles, "yashyp12",
                "yash@gmail.com", "Yash@12", 989898L, "Male", "MAHARSHTRA");

        obj1.getAmazonPrimeInfo();

    }
}
