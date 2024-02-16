package Cyberpunk2.Nomads;

import Cyberpunk2.BuildingACharacter;
import Cyberpunk2.Person;

public class NomadFactory extends BuildingACharacter {

    public Person createPerson(String type){
        Person person = null;

        if (type.equals("Panam")){
            person = new PanamPalmer();
        }
        return person;
    }
}