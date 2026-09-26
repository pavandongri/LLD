package behavioural.iterator;

public class PlaylistIterator implements Iterator<Song> {
    private final Playlist playlist;
    private int index;

    public PlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return (index < this.playlist.songs.size());
    }

    @Override
    public Song next() {
        Song song = this.playlist.songs.get(index);
        index++;
        return song;
    }

    @Override
    public boolean hasPrevious() {
        return (!this.playlist.songs.isEmpty() && index > 0);
    }

    @Override
    public Song previous() {
        this.index -= 1;
        Song song = this.playlist.songs.get(this.index);
        return song;
    }

}
