package Singleton5;

public enum EnumSingletone {
    INSTANCE;

    int value;

    private EnumSingletone() {
        System.out.println("на основе enum");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
//не ленивая инициализация