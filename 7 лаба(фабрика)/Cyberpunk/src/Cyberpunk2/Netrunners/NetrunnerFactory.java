package Cyberpunk2.Netrunners;

import Cyberpunk2.BuildingACharacter;
import Cyberpunk2.Person;

public class NetrunnerFactory extends BuildingACharacter {

    public Person createPerson(String type){
        Person person = null;

        if (type.equals("Alt")){
            person = new AltCunningham();
        }
        return person;
    }
}