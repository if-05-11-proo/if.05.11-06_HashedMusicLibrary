package at.htlleonding.musiclibrary;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MusicLibrary {
    private TrackNode[] buckets;

    /**
     * Creates an empty music library.
     * @param bucketCount The number of hash buckets to create.
     */
    public MusicLibrary(int bucketCount) {
        throw new RuntimeException(":(");
    }

    /**
     * Adds a track to the music library's hash table - but only if it's not already in the library!
     * @param track The track to add.
     * @return The node of the added track for checking its correctness. Returns null if duplicate.
     */
    public TrackNode addTrack(Track track) {
        throw new RuntimeException(":(");
    }

    /**
     * Reads lines from a file (while ignoring the first header row) adds them to the library.
     * Throws a MusicLibraryException when something goes wrong.
     * @param filePath The path to the .csv file containing the tracks.
     */
    public void addTracksFromFile(String filePath) {
        throw new RuntimeException(":(");
    }

    /**
     * Prints all the tracks in the library grouped by their hash buckets.
     */
    public void printAllTracks() {
        throw new RuntimeException(":(");
    }

    /**
     * Get the total number of stored tracks.
     * @return The total number of tracks in the library.
     */
    public int getTrackCount() {
        throw new RuntimeException(":(");
    }

    /**
     * Determines the largest hash bucket's item count.
     * @return The number of tracks in the largest bucket.
     */
    public int getLargestBucketSize() {
        throw new RuntimeException(":(");
    }

    /**
     * Determines the average item count per hash bucket.
     * @return The average item count per hash bucket.
     */
    public double getAverageBucketSize() {
        throw new RuntimeException(":(");
    }

    /**
     * Searches for the track with the specified artist and title.
     * @param artist The artist we're looking for.
     * @param title The track title we're looking for.
     * @return The node containing the track - or null if not found.
     */
    public TrackNode getTrackByArtistAndTitle(String artist, String title) {
        throw new RuntimeException(":(");
    }
}
