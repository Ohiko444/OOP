package NoSRP;

public class Hairdresser extends Master{

    public String name;

    public String profession;

    public Hairdresser(String name) {
        super(name);
        this.profession = "парикмахер";
    }

    public int hairExtensions(int customers) {
        return 4000 * customers;
    }

    public int hairColoring(int customers) {
        return 1000 * customers;
    }

    public int hairCutting(int customers) {
        return 300 * customers;
    }

    public int creatingHairstyle(int customers) {
        return 2500 * customers;
    }

    public String getProfession() {
        return profession;
    }

}
