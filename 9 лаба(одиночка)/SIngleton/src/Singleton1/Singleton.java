package Singleton1;

public class Singleton {

    private static Singleton uniqueInstance;
    public String value;

    private Singleton(){}

    private Singleton(String value){
        System.out.println("наивный потокоНЕбезопасный, с ленивой инициализацией");
        this.value = value;
    }

    static Singleton getInstance(String value){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton(value);
        }
        return uniqueInstance;
    }
}

//ленивая инициализация