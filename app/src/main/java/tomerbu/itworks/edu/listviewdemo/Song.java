package tomerbu.itworks.edu.listviewdemo;

/**
 * Created by Dev on 09/02/2016.
 */
public class Song {
    String title;
    String artist;
    String duration;
    int imageResID;

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration='" + duration + '\'' +
                ", imageResID=" + imageResID +
                '}';
    }

    public Song(String title, String artist, String duration, int imageResID) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.imageResID = imageResID;
    }
}
