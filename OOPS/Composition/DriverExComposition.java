
// examp of composition  - payent flow 
class Address {

    String locality;
    String area;
    String city;
    String state;
    int pinCode;

// address constructor
    Address(String locality, String area, String city, String state, int pinCode) {
        this.locality = locality;
        this.area = area;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public void displayAddress() {
        System.out.println("-- Address Details --");
        System.out.println("locality " + locality);
        System.out.println("Area " + area);
        System.out.println("city " + city);
        System.out.println("state " + state);
        System.out.println("pinCode " + pinCode);
    }
}

class Card {

    String Bank;
    String expiryDate;
    int cvv;
    Long cardNumber;

    Card(String bank, String expiryDate,
            int cvv, Long cardNumber) {
        this.Bank = bank;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardNumber = cardNumber;

    }

    public void displayCard() {
        System.out.println("Card Details ");
        System.out.println("Bank is : " + Bank);
        System.out.println("Expiry Date " + expiryDate);
        System.out.println("CVV Number " + cvv);
        System.out.println("Card Number " + cardNumber);
    }
}

class Customer {

    String name;
    String email;
    Long contact;
    Address[] address;
    Card card;

    Customer(String name, String email, Long contact, Address[] address, Card card) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.card = card;
    }

    public void displayCustomer() {
        System.out.print("Customer Details ");
        System.out.println("name :" + name);
        System.out.println("Email :" + email);
        System.out.println("contact :" + contact);
    }
}

public class DriverExComposition {

    public static void main(String[] args) {

        Address address1
                = new Address("JM ROAD", "Deccan", "Pune", "MH", 425001);

        Address address2
                = new Address("WAGH NAGAR", "GOODLUCK", "JALGAON", "MH", 425002);

        Card card = new Card("SBI", "01/27", 123, 1234_1234_1234l);

        Customer customer
                = new Customer("Ramesh Kumar", "ramesh@gmail.com", 9878454545L,
                        new Address[]{address1, address2}, card);

        customer.displayCustomer();
        System.out.println("      ----------------");
        System.out.println("      ----------------");
        customer.card.displayCard();

        for (Address ele : customer.address) {
            ele.displayAddress();
        }

    }
}
