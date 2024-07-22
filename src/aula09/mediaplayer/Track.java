package aula09.mediaplayer;

public class Track {
    private final String artist;
    private final String title;
    private final int duration;
    private final String album;
    private final int year;

    public Track(String artist, String title, int duration, String album, int year) {
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
    
    public int getDuration() {
        return duration;
    }

    public String getAlbum() {
        return album;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return title + " - " + artist + " - " + album + " - " + year + " - " + duration;
    }
    
}
