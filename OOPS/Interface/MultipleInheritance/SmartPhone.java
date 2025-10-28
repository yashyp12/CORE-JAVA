package Interface.MultipleInheritance;

public class SmartPhone implements Phone, Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("taking phooto");
    }

    @Override
    public void recordVideo() {
        System.out.println("record video");
    }

    @Override
    public void playMusic() {
        System.out.println("play music");
    }

    @Override
    public void stopMusic() {
        System.out.println("stop music");
    }

    @Override
    public void makeCall() {
        System.out.println("make call ");
    }

    @Override
    public void endCall() {
        System.out.println("end call");
    }

    public static void main(String[] args) {

    }
}
