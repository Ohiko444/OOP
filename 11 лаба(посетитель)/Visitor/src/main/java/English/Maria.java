package English;

public class Maria implements Teacher {

    private String SU;
    private int experience;
    private Teacher mentor;

    public Maria(String SU, int experience, Teacher mentor) {
        this.SU = SU;
        this.experience = experience;
        this.mentor = mentor;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitMP(this);
    }

    public int getExperience() {return experience;}
    public String getSU() {return SU;}
    public Teacher getMentor() {return mentor;}
}
