import java.util.ArrayList;
import java.util.List;

public class An implements Element {
    String an;
    List<Grupa> grupaList;

    public An(String an) {
        this.an = an;
        this.grupaList = new ArrayList<>();
    }

    @Override
    public Element add(Element element) {
        this.grupaList.add((Grupa) element);
        return element;
    }

    public void setAn(String an) {
        this.an = an;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.printAn(this);
    }


}
