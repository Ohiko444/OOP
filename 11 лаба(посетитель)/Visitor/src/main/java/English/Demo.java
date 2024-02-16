package English;

public class Demo {

    public static void main(String[] args) {
        Antonina antonina = new Antonina("Антонина Викторовна", 5);
        Maria maria = new Maria("Мария Петровна", 1, antonina);
        Valery valery = new Valery("Валерий Леонидович", 6);

        CompoundTeacher compoundShape = new CompoundTeacher("Старшие преподаватели");
        compoundShape.add(antonina);
        compoundShape.add(valery);

        CompoundTeacher c = new CompoundTeacher("Младшие преподаватели");
        c.add(maria);
        compoundShape.add(c);

        export(maria, antonina, valery, compoundShape);
    }

    private static void export(Teacher... teachers) {
        ExportVisitor exportVisitor = new ExportVisitor();
        System.out.println(exportVisitor.export(teachers));
    }

}
