package Firma3;

public abstract class Basic implements Employee {

    public void add(Basic basic) {
        throw new UnsupportedOperationException();
    }
    public void remove(Basic basic) {
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

    public double getSalary() {throw new UnsupportedOperationException();}

    public String getPost() {throw new UnsupportedOperationException();}
}
