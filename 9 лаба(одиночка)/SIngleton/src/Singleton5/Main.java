package Singleton5;

public class Main {
    public static void main(String[] args) {
        EnumSingletone singleton = EnumSingletone.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
        System.out.println(EnumSingletone.INSTANCE);
        System.out.println(EnumSingletone.INSTANCE);
    }
}
