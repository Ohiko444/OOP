package Singleton2;

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){
        System.out.println("потокобезопасный без ленивой инициализации");
    }

    static Singleton getInstance(){
        return uniqueInstance;
    }
}
//не ленивая инициализация