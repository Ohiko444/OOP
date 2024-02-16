package OCP;

public class Manicurist extends Master {

    public String name;
    public String profession;

    public Manicurist(String name) {
        super(name);
        this.profession = "маникюрщица";
    }

    public int removingTheManicure(int customers) {
        return 100 * customers;
    }

    public int nailExtensions(int customers) {
        return 900 * customers;
    }

    public int creatingAManicure(int customers) {
        return 900 * customers;
    }

    public String getProfession() {
        return profession;
    }
}
