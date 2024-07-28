package music;

public class Duration {
    private final int duration;

    public Duration(int duration){

        if(duration < 0){
            throw new IllegalArgumentException("Invalid duration");
        }

        this.duration = duration;
    }

    public int getSeconds(){
        return duration;
    }

    public Duration add(Duration duration){
        return new Duration(this.duration + duration.getSeconds());
    }

    public String toString(){
        int hours = duration / 3600;
        int minutes = (duration % 3600)/ 60;
        int seconds = duration % 60;
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
