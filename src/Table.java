public class Table {

    private String title;

    public Table(String table) {
        this.title = table;
    }

    public void print(Table table) {
        System.out.println("Table: " + this.title);
    }
}
