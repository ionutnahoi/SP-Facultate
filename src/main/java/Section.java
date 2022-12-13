import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String name;
    private List<Element> elements;


    public Section(String name) {
        this.name = name;
        elements = new ArrayList<>();
    }

    public void print() {
        System.out.println(name);
        elements.forEach(Element::print);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for (Element el : elements) {
            el.accept(visitor);
        }
    }

    public void add(Element element) {
        elements.add(element);
    }

}
