package Person;

import java.util.ArrayList;

public class SportsTeam {
    ArrayList<Person> sportsmans;

    public SportsTeam(){
        sportsmans = new ArrayList<Person>();

        addSportsman("Никита", 16);
        addSportsman("Екатерина", 17);
        addSportsman("Диана", 15);
    }

    public void addSportsman(String name, int age){
        Person person = new Person(name, age);

        sportsmans.add(person);
    }

    public Iterator createIterator(){
        return new SportsTeamIterator(sportsmans);
    }
}
