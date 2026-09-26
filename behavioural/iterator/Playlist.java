package behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public final List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public void removeSong(Song song) {
        this.songs.remove(song);
    }

    public Iterator<Song> createIterator() {
        return new PlaylistIterator(this);
    }
}