package My;

public class Maria implements TableElement{
    @Override
    public void accept(Visitor visitor) {
        visitor.report(this);
    }
}
