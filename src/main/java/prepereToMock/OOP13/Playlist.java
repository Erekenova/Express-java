package prepereToMock.OOP13;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String title;
    private final List<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addTrackToPlaylist(Song song) {
        songs.add(song);
        updatePositions();
    }

    public void removeTrackFromPlaylist(String title) {
        songs.removeIf(song -> song.getTitle().equals(title));
        updatePositions();
    }

    private void updatePositions() {
        for (int i = 0; i < songs.size(); i++) {
            songs.get(i).setPosition(i + 1);
        }
    }

    public int calculateDuration() {
        int sum = 0;
        for (Song song : songs) {
            sum += song.getDuration();
        }
        return sum;
    }

    public void showTrack() {
        System.out.println("Песни в плейлисте " + title + ":");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
