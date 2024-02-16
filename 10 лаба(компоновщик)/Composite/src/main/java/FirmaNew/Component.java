package FirmaNew;

public abstract class Component {

    public void addComponent(Component component) {
        throw new UnsupportedOperationException();
    }
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    public String name(){
        throw new UnsupportedOperationException();
    }

    public double salary(){
        throw new UnsupportedOperationException();
    }

    public String post(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public double allSalary() {throw new UnsupportedOperationException();}

    public String allPost() {throw new UnsupportedOperationException();}
}
