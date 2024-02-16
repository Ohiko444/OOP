package My;

public class SpokenEnglishVisitor implements Visitor {
    @Override
    public void report(Antonina antonina) {
        System.out.println("Антонина Петровна обучает Ивана разговорному английсткому.");
    }

    @Override
    public void report(Maria maria) {
        System.out.println("Мария Андреевна обучает Настю разговорному английсткому.");
    }

    @Override
    public void report(Valery valery) {
        System.out.println("Валерий Леонидович обучает Катю разговорному английсткому.");
    }
}
