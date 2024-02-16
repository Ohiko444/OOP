package Cyberpunk2.Karporats;

import Cyberpunk2.BuildingACharacter;
import Cyberpunk2.Person;

public class KarporatFactory extends BuildingACharacter {

    public Person createPerson(String type){
        Person person = null;

        if (type.equals("Adam")){
            person = new AdamSmasher();
        } else if (type.equals("Saburo")){
            person = new SaburoArasaka();
        }
        return person;
    }
}
