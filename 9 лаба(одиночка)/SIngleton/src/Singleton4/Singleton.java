package Singleton4;

public class Singleton {
    private static Singleton instanse;
    public String value;

    private Singleton(String value) {
        System.out.println("потокобезопасный с Double-Checked Locking");
        this.value = value;
    }

    public static Singleton getInstance(String value){
        Singleton localInstance = instanse;
        if (localInstance == null) {
            synchronized (Singleton.class){
                localInstance = instanse;
                if (localInstance == null){
                    instanse = localInstance = new Singleton(value);
                }
            }
        }
        return localInstance;
    }
}

//ленивая инициализация
