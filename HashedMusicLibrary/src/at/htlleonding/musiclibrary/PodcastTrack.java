package at.htlleonding.musiclibrary;

public class PodcastTrack extends Track{
    private static int TRUNCATED_DESCRIPTION_LENGTH = 40;
    private static String ELLIPSIS_TEXT = "...";

    private String description;
    private int day;
    private int month;

    public String getDescription() {
        return description;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    /**
     * Returns the truncated description with ellipsis (...), if it's longer than the constant maximum length.
     * @return The truncated description.
     */
    public String getTruncatedDescription() {
        throw new RuntimeException(":(");
    }

    public PodcastTrack(String album, String artist, int duration, String title, int year, int month, int day, String description) {
        super(album, artist, duration, title, year);
        this.description = description;
        this.day = day;
        this.month = month;
    }
}
