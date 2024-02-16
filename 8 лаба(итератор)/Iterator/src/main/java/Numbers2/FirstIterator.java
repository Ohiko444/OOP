package Numbers2;

public class FirstIterator implements Iterator {

    Object[] list;
    int count = 0;

    public FirstIterator(Object[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (count >= list.length || list[count] == null) {
            return false;
        } else
            return true;
    }

    public Object next() {
        Object x = list[count];
        count++;
        return x;
    }

}
