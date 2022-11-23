public interface Element {
    Element add(Element element);

    void accept(Visitor visitor);

}
