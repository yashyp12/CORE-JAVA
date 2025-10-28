package Interface.AnimalInterface;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep(){
        System.out.println("Dog is sleeping");
    }

}
