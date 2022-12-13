import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    List<SubChapter> subChapterList=new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int createSubChapter(String subChapterName) {
        this.subChapterList.add(new SubChapter(subChapterName));
        return subChapterList.size();
    }

    public SubChapter getChapter(int position) {
        return subChapterList.get(position-1);
    }

    public void print() {
        System.out.println(this.name);
    }
}
