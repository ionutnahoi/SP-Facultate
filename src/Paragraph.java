public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        if (alignStrategy == null)
            System.out.println("Paragraph: " + text);
        else {
            alignStrategy.render(this);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
}
