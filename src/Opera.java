import java.util.ArrayList;

public class Opera extends MusicalShow{
    int choirSize;


    public Opera(Director director, String title, int duration, String musicAuthor, String librettoText, int choirSize) {
        super(director, title, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
        listOfActors = new ArrayList<>();
    }
}
