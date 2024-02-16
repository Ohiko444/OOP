package NoSRP;

public class BrowMaster extends Master{

    public String name;

    public String profession;

    public BrowMaster(String name) {
        super(name);
        this.profession = "бровист";
    }

    public int pluckingBrows(int customers){
        return 100 * customers;
    }

    public int eyebrowPainting(int customers){
        return 300 * customers;
    }

    public int laminationBrows(int customers){
        return 1000 * customers;
    }

    public String getProfession() {
        return profession;
    }
}
