package Cyberpunk1;

public class BuildingACharacter {

    ChoiceFactory factory;

    public BuildingACharacter(){}

    public BuildingACharacter(ChoiceFactory factory){
        this.factory = factory;
    }

    public Person orderPerson(String type){
        Person person;

        person = factory.createPerson(type);

        person.nickname();
        person.description();
        person.belonging();
        person.equipment();
        return person;
    }
}
