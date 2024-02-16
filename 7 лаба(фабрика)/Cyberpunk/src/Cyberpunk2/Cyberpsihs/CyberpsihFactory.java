package Cyberpunk2.Cyberpsihs;

import Cyberpunk2.BuildingACharacter;
import Cyberpunk2.Person;

public class CyberpsihFactory extends BuildingACharacter {

    public Person createPerson(String type){
        Person person = null;

        if (type.equals("Melissa")){
            person = new MelissaRory();
        } else if (type.equals("Norio")){
            person = new NorioAkuhara();
        }
        return person;
    }
}
