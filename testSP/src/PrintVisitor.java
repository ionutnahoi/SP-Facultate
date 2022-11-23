public class PrintVisitor implements Visitor {


    @Override
    public void printGrupa(Grupa grupa) {
        System.out.println("Grupa" + grupa.nume + " " + grupa.semiGrupaList);
    }

    @Override
    public void printSemiGrupa(SemiGrupa semiGrupa) {
        System.out.println("Semigrupa " + semiGrupa.nume + semiGrupa.studentList);
    }

    @Override
    public void printAn(An an) {
        System.out.println(an.an + " " + an.grupaList);

    }

    @Override
    public void printStudent(Student student) {
        System.out.println(student.nume + " " + student.email);

    }
}
