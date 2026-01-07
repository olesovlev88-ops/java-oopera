import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;


    public Opera(Director director, String title, int duration, Person musicAuthor, String librettoText, int choirSize) {
        super(director, title, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
