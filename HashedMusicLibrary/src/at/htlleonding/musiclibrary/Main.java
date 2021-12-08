package at.htlleonding.musiclibrary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        MusicLibrary musicLibrary = new MusicLibrary(31);

        musicLibrary.addTracksFromFile("data/podcasts.csv");
        musicLibrary.addTracksFromFile("data/songs.csv");

        musicLibrary.printAllTracks();

        System.out.format("Largest bucket size: %d %n", musicLibrary.getLargestBucketSize());
        System.out.format("Average bucket size: %.2f %n", musicLibrary.getAverageBucketSize());

        TrackNode nodeMeinBaby = musicLibrary.getTrackByArtistAndTitle("Texta", "Mein Baby");
        System.out.format("Found song \"%s\" in bucket %d at position %d.%n", nodeMeinBaby.getTrack().getTitle(), nodeMeinBaby.getBucketIndex(), nodeMeinBaby.getListIndex());

        TrackNode nodeGeschichteBgld = musicLibrary.getTrackByArtistAndTitle("ORF Ö1", "Geschiche des Burgenlandes - Teil 3");
        System.out.format("Found episode \"%s\" in bucket %d at position %d.%n", nodeGeschichteBgld.getTrack().getTitle(), nodeGeschichteBgld.getBucketIndex(), nodeGeschichteBgld.getListIndex());
    }
}
