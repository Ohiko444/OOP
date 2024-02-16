package Cyberpunk1;

public class ChoiceFactory {

    public Person createPerson(String type){
        Person person = null;

        if (type.equals("Alt")){
            person = new AltCunningham();
        } else if (type.equals("Adam")){
            person = new AdamSmasher();
        } else if (type.equals("Panam")){
            person = new PanamPalmer();
        } else if (type.equals("Melissa")){
            person = new MelissaRory();
        }
        return person;
    }
}
