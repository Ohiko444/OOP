package PersonJSON;

public interface Iterator {

    boolean hasNext();
    Person next();
    void remove(int index);

}
