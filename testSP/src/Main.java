import java.util.List;

public class Main {
    public static void main(String[] args) {

        Element info3=new An("informatica 3")
                .add(new Grupa("Grupa 1")
                        .add(new SemiGrupa("Semigrupa 1.1")
                                .add(new Student("Popescu I","popescu@acme.edu"))
                                .add(new Student("Ionescu E","ionescu1@ecme.edu")))
                        .add(new SemiGrupa("semigrupa 1.2")
                                .add(new Student("Vasile I","vasilescu@acme.edu"))
                                .add(new Student("Georgescu E","georgescu1@acme.edu"))))
                .add(new Grupa("Grupa 2"));

        Visitor visitor=new PrintVisitor();
        info3.accept(visitor);

    }
}
