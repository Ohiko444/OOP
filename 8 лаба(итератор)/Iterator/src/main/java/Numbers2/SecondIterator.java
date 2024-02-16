package Numbers2;

public class SecondIterator implements Iterator {
    Object[] arrayOfElements;
    int currentSize = 0;
    String type;

    public SecondIterator(Object[] arrayOfElements) {
        int number1 = (int) arrayOfElements[0];
        String str = (String) arrayOfElements[1];
        double doub = (double) arrayOfElements[2];
        char symbol = (char) arrayOfElements[3];
        this.arrayOfElements = new Object[] {symbol, str, number1, doub};
    }

    public boolean hasNext() {
        if (currentSize >= arrayOfElements.length || arrayOfElements[currentSize] == null) return false;
        else return true;
    }

    public Object next() {
        Object element = arrayOfElements[currentSize];
        currentSize++;
        return element;
    }
}
