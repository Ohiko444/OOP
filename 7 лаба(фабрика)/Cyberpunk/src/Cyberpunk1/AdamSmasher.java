package Cyberpunk1;

public class AdamSmasher implements Person{
    public String nickname() {
        return "\n---\nАдам Смешер";
    }

    public String belonging() {
        return "\n---\n'Карпорат'";
    }

    public String description() {
        return "\n---\nКиборг, прошедший полную перестройку тела, телохранитель и глава службы безопасности корпорации «Арасака»";
    }

    public String equipment() {
        return "\n---\nПерсонаж умер, но врачам удалось вернуть его к жизни и сделать из него киборга, который стал 'ходячим оружеем'";
    }

    public String toString(){
        return nickname() + belonging() + description() + equipment();
    }
}
