package at.htlleonding.musiclibrary;

import java.util.Objects;

public class Track {
    private String album;
    private String artist;
    private int duration;
    private String title;
    private int year;

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    /**
     * Returns the song's duration in readable format (i.e. mm:ss).
     * @return A String containing the song's length.
     */
    public String getLength() {
        throw new RuntimeException(":(");
    }

    public Track(String album, String artist, int duration, String title, int year) {
        this.album = album;
        this.artist = artist;
        this.duration = duration;
        this.title = title;
        this.year = year;
    }
}
