//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.List;
import  java.util.ArrayList;
public class Theatre {
    public static void main(String[] args) {
        Director director1 = new Director("James", "Cameron", Gender.MALE, 51);
        Director director2= new Director("Konstantin", "Sergeev", Gender.MALE, 23);

        Actor actor1 = new Actor("Leonardo", "DiCaprio", Gender.MALE, 1.83);
        Actor actor2 = new Actor("Kate", "Winslet", Gender.FEMALE, 1.69);
        Actor actor3 = new Actor("Maria", "Ivanova", Gender.FEMALE, 1.72);

        List<Actor> actors1 = new ArrayList<>();
        actors1.add(actor3);
        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);

        Show show1 = new Show("Titanic", 194, director1, actors);

        MusicalShow opera = new Opera(
                "Carmen",
                160,
                director2,
                actors1,
                "Bizet",
                "opera libretto",
                40);

        MusicalShow ballet = new Ballet(
                "Swan lake",
                140,
                director2,
                actors1,
                "Tchaikovsky",
                "About love and magic",
                "Marius Petipa");

        System.out.println("Списки актёров: ");
        show1.printActors();
        ballet.printActors();
        opera.printActors();

        System.out.println("Замена актера.");
        ballet.replaceActor("Ivanova", actor2);

        System.out.println("Списки актёров баллета: ");
        ballet.printActors();

        System.out.println("Замена несуществующего актёра.");
        opera.replaceActor("Petrova", actor1);

        System.out.println("Либретто:");
        ballet.printLibretto();
        opera.printLibretto();
    }
}