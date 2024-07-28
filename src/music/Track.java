package music;

public class Track {
    private final String title;
    private final String artist;
    private final String album;
    private final int year;
    private final Duration duration;

    public Track(String title, String artist, String album, int year, Duration duration) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Invalid title");
        }

        if (artist == null || artist.isBlank()){
            throw new IllegalArgumentException("Invalid artist");
        }

        if (album == null || album.isBlank()){
            throw new IllegalArgumentException("Invalid album");
        }

        if (year < 0){
            throw new IllegalArgumentException("Invalid year");
        }

        if (duration == null){
            throw new IllegalArgumentException("Invalid duration");
        }

        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getYear() {
        return year;
    }

    public Duration getDuration() {
        return duration;
    }

    public String toString(){
        return title + "-" + artist + "ano de " + year;
    }

}