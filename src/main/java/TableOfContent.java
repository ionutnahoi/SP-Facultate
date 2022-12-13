public class TableOfContent implements Element {

    @Override
    public void print() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}

