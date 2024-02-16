package Singleton6;

public class Singleton {
    private Singleton(){
        System.out.println("на основе внутренних классов ");
    }

    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
