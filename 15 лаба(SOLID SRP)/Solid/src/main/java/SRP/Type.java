package SRP;

public enum Type {

    MANICURIST, BROWMASTER, HAIRDRESSER;

    public String toString(){
        switch (this){
            case MANICURIST: return "маникюрщица";
            case BROWMASTER: return "бровист";
            case HAIRDRESSER: return "парикмахер";
        }
        return null;
    }

}
