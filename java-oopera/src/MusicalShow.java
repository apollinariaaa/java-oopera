import java.util.List;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String libretto;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors, String musicAuthor, String libretto){
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.libretto = libretto;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibretto() {
        return libretto;
    }
    public void printLibretto() {
        System.out.println("Либретто спектакля " + getTitle() + " : " + libretto);
    }
}
