import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(Director director, String title, int duration) {
        this.director = director;
        this.title = title;
        this.duration = duration;
        listOfActors = new ArrayList<>();
    }

    public void printActorsInfo() {
        for (Actor actor : listOfActors) {
            System.out.println(listOfActors);
        }
    }


    public void addNewActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Этот актёр уже участвует в постановке");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актёр успешно добавлен");
        }
    }

    public void changeActor(String surname, Actor newActor) {
        boolean found = false;
        int count = 0; // счётчик для учёта количества актёров с указанной фамилией

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.surname.equals(surname)) {
                count++;
                if (count > 1) {
                    System.out.println("В списке есть несколько актёров с фамилией " + surname + ". Замена не выполнена.");
                    break;
                } else {
                    listOfActors.set(i, newActor);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Актёр с такой фамилией не найден.");
        } else if (count == 1) {
            System.out.println("Актёр успешно заменён.");
        }
    }
}
