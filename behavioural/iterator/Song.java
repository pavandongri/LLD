package behavioural.iterator;

public class Song {
    private final String name;
    private final String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + this.name + " song , composed by " + this.artist);
    }
}