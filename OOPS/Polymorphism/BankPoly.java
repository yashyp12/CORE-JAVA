
public class BankPoly {

    public static void main(String[] args) {

    }
}

class Bank {

    String name;
    long accountNumber;
    long atmNumber;
    int cvv;

    public Bank(String name, long accountNumber, int cvv, long atmNumber) {
        super();
        this.name = name;
        this.accountNumber = accountNumber;
        this.cvv = cvv;
        this.atmNumber = atmNumber;
    }

    public String displayBank() {
        return "Bank [name= " + name + ",accountNumber = " + accountNumber+ ", atmNumber " + atmNumber + ", cvv" + cvv + " ]";
    }
}


class Payments{
    String name;
    String emailId;
    long contact;
    Bank bank;


    public Payments(String name,String emailId,long contact,Bank bank)
    {
        super();
        this.name= name;
        this.emailId = emailId;
        this.contact = contact;
        this.bank = bank;
    }

}