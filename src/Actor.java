import java.util.Objects;

public class Actor extends Person {
    double height;

    public Actor(String name, String surname, double height) {
        this.name = name;
        this.surname = surname;
        this.height = height;
    }

    @Override public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o; return Double.compare(height, actor.height) == 0
                && Objects.equals(name, actor.name) && Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
