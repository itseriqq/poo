package music;

import java.util.ArrayList;
import java.util.Collections;

public class Player{
    private ArrayList<Track> queue;
    private Boolean isPlaying;
    private int volume;
    private Track currentTrack;

    public Player(){
        this.queue = new ArrayList<>();
        this.isPlaying = false;
        this.volume = 50;
        this.currentTrack = null;
    }

    public void addTrack(Track track){
        queue.add(track);
    }

    public void removeTrack(Track track){
        queue.remove(track);
    }

    public void play(){
        if(queue.size() == 0){
            throw new IllegalArgumentException("Nenhum player ativo");
        }
        if(currentTrack == null){
            currentTrack = queue.get(0);
        }

        isPlaying = true;
    }

    public Track getCurrentTrack(){

        if(currentTrack == null){
            throw new IllegalArgumentException("invalid currentTrack");
        }

        return currentTrack;
    } 

    public Boolean isPlaying() {
        return isPlaying;
    }

    public int getVolume() {
        return volume;
    }

    public void stop() {
        isPlaying = false;
    }

    public void next() {
        if (queue.size() == 0) {
            throw new IllegalStateException("Nenhuma faixa na playlist");
        }
        int index = queue.indexOf(currentTrack);
        index++;

        if (index >= queue.size()) {
            index = 0;
            stop();
        }
        currentTrack = queue.get(index);
    }

    public Playlist getQueuePlaylist() {
        Playlist playlist = new Playlist("Queue");

        for (Track track : queue) {
            playlist.addTrack(track);
        }

        System.out.println(playlist);

        return playlist;
    }

     public void shuffle() {
        if (queue.size() == 0) {
            return;
        }
        int index = queue.indexOf(currentTrack);
        ArrayList<Track> remainingQueue = new ArrayList<>(queue.subList(index, queue.size()));
        Collections.shuffle(remainingQueue);
        
        queue.subList(index, queue.size()).clear();
        queue.addAll(remainingQueue);
    }

    public void previous() {
        if (queue.size() == 0) {
            throw new IllegalStateException("Nenhuma faixa na playlist");
        }
        int index = queue.indexOf(currentTrack);
        index--;

        if (index < 0) {
            index = 0;
        }
        currentTrack = queue.get(index);
    }

    public void addPlaylist(Playlist playlist) {
        for (Track track : playlist.getTracks()) {
            addTrack(track);
        }
    }

}