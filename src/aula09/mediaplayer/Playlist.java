package aula09.mediaplayer;
import java.util.ArrayList;

public class Playlist {
    private ArrayList<Track> tracks;
    private String title;

    public Playlist(String title){
        tracks = new ArrayList<>();
        this.title = title;
    }

    public void addTrack(Track track){
        tracks.add(track);
    }

    public void removeTrack(Track track){
        tracks.remove(track);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(title + "\n");
        for (var track : tracks){
            s.append(track);
            s.append("\n");
        }

        return s.toString();
    }

}
