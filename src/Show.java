import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;
    Scanner scanner;

    public Show(Director director, String title, int duration) {
        scanner = new Scanner(System.in);
        this.director = director;
        this.title = title;
        this.duration = duration;
        listOfActors = new ArrayList<>();
    }

    public void printActorsInfo() {
        for (Actor listOfActor : listOfActors) {
            System.out.println(listOfActor.toString());
        }
    }


    public void addNewActor() {
        Actor newActor = new Actor(null, null, 0.0);
        System.out.println("Напишите имя, фамилию и рост актёра:");
        newActor.name = scanner.nextLine();
        newActor.surname = scanner.nextLine();
        newActor.height = scanner.nextDouble();
        if (listOfActors.contains(newActor)) {
            System.out.println("Этот актёр уже участвует в постановке");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актёр успешно добавлен");
        }
    }

    public void changeActor(String surname, Actor newActor) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.surname.equals(surname)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с такой фамилией не найден.");
        } else {
            System.out.println("Актёр успешно заменён.");
        }
    }
}
