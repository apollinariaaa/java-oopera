import java.util.List;

public class Opera extends MusicalShow {
    private  int choirSize;

    public Opera(String title, int duration, Director director, List<Actor> listOfActors, String musicAuthor, String libretto, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, libretto);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
