package prepereToMock.OOP13;

public class Song {
    private final String title;
    private final String artist;
    private final int duration;
    private int position;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public int getPosition() {
        return position;
    }

    void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return position + ". " + title + " — " + artist + " — " + duration;
    }
}
