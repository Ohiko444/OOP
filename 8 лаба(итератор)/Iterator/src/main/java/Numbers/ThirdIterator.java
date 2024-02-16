package Numbers;

import java.util.ArrayList;

public class ThirdIterator implements Iterator {
    Object[] arrayOfElements;
    int currentSize = 0;

    public ThirdIterator(Object[] arrayOfElements) {

        int[] array = (int[]) arrayOfElements[2];
        ArrayList<Integer> arrayCh = new ArrayList<>();
        ArrayList<Integer> arrayNch = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 1){
                arrayNch.add(array[i]);
            } else{
                arrayCh.add(array[i]);
            }
        }

        int number1 = (int) arrayOfElements[0];
        int number2 = (int) arrayOfElements[1];
        char symbol = (char) arrayOfElements[3];
        this.arrayOfElements = new Object[] {arrayNch, number1, symbol, number2, arrayCh};
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
