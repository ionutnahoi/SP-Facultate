public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");

        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);

        int indexSubChapterOneOne = chp1.createSubChapter("Capitolul 1.1");
        SubChapter scOneOne = chp1.getChapter(indexSubChapterOneOne);

        scOneOne.createNewParagraph("Paraghapt 1");
        scOneOne.createNewParagraph("Paraghapt 2");
        scOneOne.createNewParagraph("Paraghapt 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paracrapt 5");
        scOneOne.print();
    }
}
