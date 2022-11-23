public class Student implements Element {
    String nume;

    String email;

    public Student(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    @Override
    public Element add(Element element) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.printStudent(this);
    }


}
