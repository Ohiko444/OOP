package My;

public class WrittenEnglishVisitor implements Visitor {
    @Override
    public void report(Antonina antonina) {
        System.out.println("Антонина Петровна обучает Ивана письменному английсткому.");
    }

    @Override
    public void report(Maria maria) {
        System.out.println("Мария Андреевна обучает Настю письменному английсткому.");
    }

    @Override
    public void report(Valery valery) {
        System.out.println("Валерий Леонидович обучает Катю пидсьменному английсткому.");
    }
}
