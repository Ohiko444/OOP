package My;

public class Valery implements TableElement{
    @Override
    public void accept(Visitor visitor) {
        visitor.report(this);
    }
}
