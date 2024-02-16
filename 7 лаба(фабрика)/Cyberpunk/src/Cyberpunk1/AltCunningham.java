package Cyberpunk1;

public class AltCunningham implements Person{
    public String nickname() {
        return "\n---\nАльт Каннингем";
    }

    public String belonging() {
        return "\n---\n'Нетраннер'";
    }

    public String description() {
        return "\n---\nЛучший нетраннер в Найт-Сити, создавший 'душегуб' (устройство переноса души в киберпространство)";
    }

    public String equipment() {
        return "\n---\nСражается при помощи взлома устройств, а так же киберимплантов людей";
    }

    public String toString(){
        return nickname() + belonging() + description() + equipment();
    }
}
