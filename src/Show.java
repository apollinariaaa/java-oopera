import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public  Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printDirection() {
        System.out.println("Режиссёр: " + director.getName() + " " + director.getSurname());
    }

    public void printActors() {

        for(Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if(listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.getName() + actor.getSurname() + " уже существует.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor.getName() + actor.getSurname() + " добавлен.");
        }
    }

    public  void replaceActor(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i ++) {
            if(listOfActors.get(i).getSurname().equalsIgnoreCase(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + surnameToReplace + " заменён на " + newActor.getName() + " " + newActor.getSurname());
                return;
            }
        }
    }
}
