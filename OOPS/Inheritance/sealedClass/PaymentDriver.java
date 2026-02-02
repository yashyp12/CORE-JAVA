package Inheritance.sealedClass;


public class PaymentDriver{
    static void main(String[] args) {
        Payment p1 = new CC();
        Payment p2 = new NetBanking();
        Payment p3 = new UPI();
        p1.payment();
        p2.payment();
        p3.payment();
    }
}

  sealed abstract class Payment
        permits CC, NetBanking, UPI {
    public abstract void payment();
}

final class CC extends Payment{
    @Override
    public void payment(){
        System.out.println("you have done payment via credit card");
    }
}

final class NetBanking extends Payment{
     @Override
    public void payment(){
        System.out.println("you have done payment via credit card");
    }
}

final class UPI extends Payment{
     @Override
    public void payment(){
        System.out.println("you have done payment via credit card");
    }
}
