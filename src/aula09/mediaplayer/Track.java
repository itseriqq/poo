package aula09.mediaplayer;

public class Track {
    private final String artist;
    private final String title;
    private final String duration;
    private final int album;
    private final int year;

    public Track(String artist, String title, String duration, int album, int year) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
        this.album = album;
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
    
    public String getDuration() {
        return duration;
    }

    public int getAlbum() {
        return album;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return title + " - " + artist + " - " + album + " - " + year + " - " + duration;
    }
    
}
