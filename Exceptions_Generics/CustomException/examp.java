public class examp {
 
    public static void main(String[] args) {

        Bank bank = new Bank(2000, 123);
    }
}

class InsufficientBalException extends RuntimeException{

    public InsufficientBalException(String mess) {
        super(mess);
    }
    
}

class Bank{
    double bal;
    int pin;

    public Bank(double bal,int pin) {
        this.bal = bal;
        this.pin = pin;
    }

    public void withdraw( double amt) {
        if(amt>bal){
            throw new InsufficientBalException("Insufficient bal");
        }
        this.bal-=amt;
    }


    
}
