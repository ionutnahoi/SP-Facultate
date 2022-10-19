import java.util.ArrayList;
import java.util.List;

public class Book {

    String title;

    private List<Chapter> chapterList=new ArrayList<>();

    private Author author;

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String chapterName) {
        this.chapterList.add(new Chapter(chapterName));
        return chapterList.size();
    }

    public Chapter getChapter(int position) {
        return chapterList.get(position-1);
    }

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void print() {
        System.out.println( this.title);
    }
}
