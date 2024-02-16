package Numbers;

public class SecondIterator implements Iterator {
    Object[] arrayOfElements;
    int currentSize = 0;
    String type;

    public SecondIterator(Object[] arrayOfElements) {
        int number1 = (int) arrayOfElements[0];
        int number2 = (int) arrayOfElements[1];
        int array[] = (int[]) arrayOfElements[2];
        char symbol = (char) arrayOfElements[3];
        this.arrayOfElements = new Object[] {symbol, array, number1, number2};
    }
    @Override
    public boolean hasNext() {
        if (currentSize >= arrayOfElements.length || arrayOfElements[currentSize] == null) return false;
        else return true;
    }
    @Override
    public Object next() {
        Object element = arrayOfElements[currentSize];
        currentSize++;
        return element;
    }
}
