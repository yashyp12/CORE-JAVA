package Interface.AnimalInterface;

public class Cat implements Animal {

    @Override
    public void eat(){
        System.out.println("cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping");
    }
}
