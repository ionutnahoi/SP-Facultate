import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;

    private List<Image> imageList = new ArrayList<>();

    private List<Paragraph> paragraphList = new ArrayList<>();

    private List<Table> tableList = new ArrayList<>();

    public void createNewImage(String image) {
        this.imageList.add(new Image(image));
    }

    public void createNewTable(String table) {
        this.tableList.add(new Table(table));
    }

    public void createNewParagraph(String paragraph) {
        this.paragraphList.add(new Paragraph(paragraph));
    }

    public SubChapter(String subChapterName) {
        this.name = subChapterName;
    }

    public void print() {
//        return (this.name + "\n" + this.paragraphList.forEach(paragraph -> paragraph.print(paragraph)) + "\n" + this.imageList.forEach(image -> image.print(image)) + "\n" + this.tableList.forEach(table -> table.print(table)));
        System.out.println("Subchapter: " + this.name);
        this.paragraphList.forEach(Paragraph::print);
        this.imageList.forEach(Image::print);
        this.tableList.forEach(Table::print);
    }
}
