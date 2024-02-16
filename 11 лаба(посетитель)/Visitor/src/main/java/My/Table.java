package My;

public class Table implements TableElement{
    TableElement[] tableElements;

    public Table() {
        this.tableElements = new TableElement[] {
                new Antonina(),
                new Maria(),
                new Valery()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for(TableElement element: tableElements) {
            element.accept(visitor);
        }
    }
}
