package Cyberpunk2;

public abstract class BuildingACharacter {

    public Person orderPerson(String type){
        Person person;

        person = createPerson(type);

        person.nickname();
        person.belonging();
        person.description();
        person.equipment();

        return person;
    }

    public abstract Person createPerson(String type);
}
