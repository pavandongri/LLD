package Creational.abstractfactory;

public class MacVideoPlayer implements VideoPlayer {
    @Override 
    public void playVideo(String filename) {
        System.out.println("Playing video file " + filename + " on Mac");
    }
}
