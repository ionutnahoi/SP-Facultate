import java.util.ArrayList;
import java.util.List;

public class SemiGrupa implements Element {
    String nume;
    List<Student> studentList;

    public SemiGrupa(String nume) {
        this.nume = nume;
        this.studentList = new ArrayList<>();
    }

    public SemiGrupa() {
        studentList = new ArrayList<>();
    }

    @Override
    public Element add(Element element) {
        studentList.add((Student) element);
        return element;
    }
        public void print(){
        this.accept((Visitor) this);
        }

    @Override
    public void accept(Visitor visitor) {
visitor.printSemiGrupa(this);
    }
}
