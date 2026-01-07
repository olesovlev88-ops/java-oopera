import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private Person choreographer;

    public Ballet(Director director, String title, int duration, Person musicAuthor, String librettoText, Person choreographer) {
        super(director, title, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
