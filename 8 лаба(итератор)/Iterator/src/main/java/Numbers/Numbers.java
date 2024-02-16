package Numbers;

public class Numbers {

    int oneInt;
    int twoInt;
    int[] masInt;
    char symbol;
    Object[] mass;

    public Numbers() {
        oneInt = 48;
        twoInt = 5;
        masInt = new int [] {4, 9, 7, 11, 5, 6, 13, 154, 31};
        symbol = 'm';
        mass = new Object[] {oneInt, twoInt, masInt, symbol};
    }

    public Iterator createFirstIterator() {
        return new FirstIterator(mass);
    }

    public Iterator createSecondIterator() {
        return new SecondIterator(mass);
    }

    public Iterator createThirdIterator() {
        return new ThirdIterator(mass);
    }

    public char getSymbol() {return symbol;}
    public int[] getMasInt() {return masInt;}
    public int getTwoInt() {return twoInt;}
    public int getOneInt() {return oneInt;}
}
