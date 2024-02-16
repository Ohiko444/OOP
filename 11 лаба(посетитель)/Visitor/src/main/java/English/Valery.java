package English;

public class Valery implements Teacher {

    private String SU;
    private int experience;

    public Valery(String SU, int experience) {
        this.SU = SU;
        this.experience = experience;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitVL(this);
    }

    public int getExperience() {return experience;}
    public String getSU() {return SU;}

}
