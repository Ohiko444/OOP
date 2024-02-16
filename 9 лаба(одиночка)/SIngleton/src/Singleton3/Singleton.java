package Singleton3;

public class Singleton {

    private volatile static Singleton uniqueInstance;
    public String value;

    private Singleton(){}
    private Singleton(String value) {
        System.out.println("потокобезопасный с синхронизацией getInstance");
        this.value = value;
    }

    static Singleton getInstance(String value){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton(value);
                }
            }
        }
        return uniqueInstance;
    }
}

//ленивая инициализация