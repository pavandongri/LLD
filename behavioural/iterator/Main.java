package behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Song s1 = new Song("song1", "artist1");
        Song s2 = new Song("song2", "artist2");
        Song s3 = new Song("song3", "artist3");

        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(s3);

        Iterator<Song> playlistIterator = playlist.createIterator();

        while (playlistIterator.hasNext()) {
            Song song = playlistIterator.next();
            song.play();
        }

        while (playlistIterator.hasPrevious()) {
            Song song = playlistIterator.previous();
            song.play();
        }

        while (playlistIterator.hasPrevious()) {
            Song song = playlistIterator.previous();
            song.play();
        }

        while (playlistIterator.hasNext()) {
            Song song = playlistIterator.next();
            song.play();
        }
    }
}
