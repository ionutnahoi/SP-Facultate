import java.util.ArrayList;
import java.util.List;

public class Grupa implements Element {
    String nume;
    List<SemiGrupa> semiGrupaList;

    public Grupa(String nume) {
        this.nume = nume;
        this.semiGrupaList = new ArrayList<>();
    }

    @Override
    public Element add(Element semiGrupa) {
        this.semiGrupaList.add((SemiGrupa) semiGrupa);
        return semiGrupa;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.printGrupa(this);
    }
}
