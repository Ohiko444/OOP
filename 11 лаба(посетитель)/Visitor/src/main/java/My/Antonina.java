package My;

public class Antonina implements TableElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.report(this);
    }
}
