package Numbers2;

public class Numbers {

    int oneInt;
    String str;
    double doub;
    char symbol;
    Object[] mass;

    public Numbers() {
        oneInt = 16;
        str = "dfesihfeuf";
        doub = 3.15;
        symbol = 'm';
        mass = new Object[] {oneInt, str, doub, symbol};
    }

    public Object[] getMass() {
        return mass;
    }

    public Iterator createFirstIterator() {
        return new FirstIterator(mass);
    }

    public Iterator createSecondIterator() {
        return new SecondIterator(mass);
    }

}
