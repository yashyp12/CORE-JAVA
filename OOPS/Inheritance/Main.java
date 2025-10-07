package Inheritance;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(4,3,5);
        System.out.println(box.length);

        BoxWeight obj = new BoxWeight();
        System.out.println(obj.weight + " " + obj.height);
    }
}