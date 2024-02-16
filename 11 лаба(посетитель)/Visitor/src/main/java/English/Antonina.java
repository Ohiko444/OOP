package English;

public class Antonina implements Teacher {
    private String SU;
    private int experience;

    public Antonina(String SU, int experience) {
        this.SU = SU;
        this.experience = experience;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitAV(this);
    }

    public int getExperience() {return experience;}
    public String getSU() {return SU;}
}
