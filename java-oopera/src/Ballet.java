import java.util.List;

public class Ballet extends MusicalShow {
    private String choreographer;

    public  Ballet(String title, int duration, Director director, List<Actor> listOfActors, String musicAuthor, String libretto, String choreographer){
        super(title, duration, director, listOfActors, musicAuthor, libretto);
        this.choreographer = choreographer;
        }

    public String getChoreographer() {
        return choreographer;
    }
}
