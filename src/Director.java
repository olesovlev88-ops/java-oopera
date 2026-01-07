public class Director extends Person {
    private int numberOfShows;
    Gender.Genders gender;

    public Director(String name, String surname, int numberOfShows, Gender.Genders gender) {
        this.name = name;
        this.surname = surname;
        this.numberOfShows = numberOfShows;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Director{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", numberOfShows=" + numberOfShows +
                '}';
    }

}
