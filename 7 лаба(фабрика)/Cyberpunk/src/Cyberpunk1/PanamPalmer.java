package Cyberpunk1;

public class PanamPalmer implements Person{
    public String nickname() {
        return "\n---\nПанам Палмер";
    }

    public String belonging() {
        return "\n---\n'Кочевник'";
    }

    public String description() {
        return "\n---\nКочевница из клана Альдекальдо, наёмница-соло";
    }

    public String equipment() {
        return "\n---\nСражается при помощи снайперской винтовки";
    }

    public String toString(){
        return nickname() + belonging() + description() + equipment();
    }
}