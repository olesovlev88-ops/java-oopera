import java.util.ArrayList;

public class Ballet extends MusicalShow{
    String choreographer;

    public Ballet(Director director, String title, int duration, String musicAuthor, String librettoText, String choreographer) {
        super(director, title, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
        listOfActors = new ArrayList<>();
    }
}
