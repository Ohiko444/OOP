package Cyberpunk1;

public class MelissaRory implements Person{
    public String nickname() {
        return "\n---\nМелисса Рори";
    }

    public String belonging() {
        return "\n---\n'Киберпсих'";
    }

    public String description() {
        return "\n---\nЛейтенант и старший офицер отряда особого назначения «Макс-так», подразделения полицейского департамента Найт-Сити, бывшая киберпсихопатка, прошедшая корректировку личности";
    }

    public String equipment() {
        return "\n---\nКлинки богомола «Хигураси 20-13»\nКерезников (имплант, замедляющий время)\n";
    }

    public String toString(){
        return nickname() + belonging() + description() + equipment();
    }
}