package Person;

import java.util.ArrayList;

public class SportsTeamIterator implements Iterator{
    ArrayList<Person> people;
    int position = 0;

    public SportsTeamIterator(ArrayList<Person> people){
        this.people = people;
    }

    public Person next(){
        Person person = people.get(position);
        position++;
        return person;
    }

    public boolean hasNext(){
        if (position >= people.size() || people.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

}
