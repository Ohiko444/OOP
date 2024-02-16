package English;

public class ExportVisitor implements Visitor{

    public String export(Teacher... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Список преподавателей:" + "\n--\n");
        for (Teacher teacher : args) {
            sb.append(teacher.accept(this)).append("\n--\n");
        }
        return sb.toString();
    }

    public String visitMP(Maria d) {
        return "Имя: " + d.getSU() + "\n" +
                "Стаж: " + d.getExperience() + "\n" +
                "Наставник: \n" + d.getMentor().accept(this);
    }

    public String visitAV(Antonina c) {
        return "Имя: " + c.getSU() + "\n" +
                "Стаж: " + c.getExperience();
    }

    public String visitVL(Valery r) {
        return "Имя: " + r.getSU() + "\n" +
                "Стаж: " + r.getExperience();
    }

    public String visitCompoundTeacher(CompoundTeacher cg) {
        return cg.getId() + "\n--\n" + _visitCompoundTeacher(cg);
    }

    private String _visitCompoundTeacher(CompoundTeacher cg) {
        StringBuilder sb = new StringBuilder();
        for (Teacher teacher : cg.teachers) {
            String obj = teacher.accept(this);

            obj = "   " + obj.replace("\n", "\n   ") + "\n   --\n";
            sb.append(obj);
        }
        return sb.toString();
    }

}
