package My;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();

        Visitor spoken = new SpokenEnglishVisitor();
        Visitor written = new WrittenEnglishVisitor();

        System.out.println("Преподавание разговорного английского:");
        table.accept(spoken);

        System.out.println("\n------------------------------------------\n");

        System.out.println("Преподавание письменного английского:");
        table.accept(written);
    }
}
