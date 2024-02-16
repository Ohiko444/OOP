package English;

public interface Visitor {

    String visitMP(Maria maria);

    String visitAV(Antonina antonina);

    String visitVL(Valery valery);

    String visitCompoundTeacher(CompoundTeacher cg);

}
