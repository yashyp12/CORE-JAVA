package Interface;

public class NiceCar {

    private Engine engine;
    private Media player = new CDPlayer();

    //    bydefault the engine will be o power engine
    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }

}
