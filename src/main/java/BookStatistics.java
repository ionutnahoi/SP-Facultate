public class BookStatistics implements Visitor {
    private int booksVisited;
    private int tablesVisited;
    private int imagesVisited;
    private int sectionsVisited;
    private int paragraphsVisited;
    private int tableOfContentsVisited;
    private int imageProxyVisited;

    public void printStatistics() {
        System.out.println("Statistics:\n\n");
        System.out.println("Tables visited: " + tablesVisited);
        System.out.println("Images visited: " + imagesVisited);
        System.out.println("Sections visited: " + sectionsVisited);
        System.out.println("Paragraph visited: " + paragraphsVisited);
        System.out.println("TableOfContent visited: " + tableOfContentsVisited);
        System.out.println("ImageProxy visited: " + imageProxyVisited);
    }

    @Override
    public void visitBook(Book book) {
        booksVisited++;
    }

    @Override
    public void visitSection(Section section) {
        sectionsVisited++;
    }

    @Override
    public void visitTableOfContents(TableOfContent tableOfContent) {
        tableOfContentsVisited++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraphsVisited++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxyVisited++;
    }

    @Override
    public void visitImage(Image image) {
        imagesVisited++;
    }

    @Override
    public void visitTable(Table table) {
        tablesVisited++;
    }
}
