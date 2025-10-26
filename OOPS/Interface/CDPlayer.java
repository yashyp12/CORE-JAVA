package Interface;

public class CDPlayer implements Media{

    public CDPlayer() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Music starts");
    }

    @Override
    public void stop() {
        System.out.println("Music stops");
    }
}
