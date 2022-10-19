public class Paragraph {
    private String text;

    public Paragraph(String paragraph) {
        this.text = paragraph;
    }

    public void print(Paragraph paragraph) {
        System.out.println("Paragraph: " + paragraph.text);
    }
}
