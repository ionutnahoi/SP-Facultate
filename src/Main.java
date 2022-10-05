public class Main {
    public static void main(String[] args) {
        Book book=new Book("Disco Titanic");
        book.createNewParagraph("Paraghapt 1");
        book.createNewParagraph("Paraghapt 2");
        book.createNewParagraph("Paraghapt 3");
        book.createNewImage("Image 1");
        book.createNewParagraph("Paragraph 4");
        book.createNewTable("Table 1");
        book.createNewParagraph("Paracrapt 5");
        book.print();
    }
}
