package SRP;

public class Master {

    public String name;
    public Type profession;

    public Master() {}

    public Master(String name, Type profession) {
        this.name = name;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public Type getProfession() {
        return profession;
    }
}
