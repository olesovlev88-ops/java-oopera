public class Director extends Person {
    int numberOfShows;

    public Director(String name, String surname, int numberOfShows) {
        this.name = name;
        this.surname = surname;
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", numberOfShows=" + numberOfShows +
                '}';
    }

    public void printDirectorInfo() {
       toString();
    }

}
