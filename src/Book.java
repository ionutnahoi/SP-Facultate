import java.util.ArrayList;
import java.util.List;

public class Book {

    String title;
    List<String> image = new ArrayList<>();
    List<String> table = new ArrayList<>();
    List<String> paragraph = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void createNewImage(String image) {
        this.image.add(image);
    }

    public void createNewTable(String table) {
        this.table.add(table);
    }

    public void createNewParagraph(String paragraph) {
        this.paragraph.add(paragraph);
    }

    public void print() {
        System.out.println("Title: " + this.title + "\nPararaphs: " + this.paragraph + "\nImage: " + this.image );
    }
}
