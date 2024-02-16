package Person;

public class StudyGroupIterator implements Iterator{

    Person[] people;
    int position = 0;

    public StudyGroupIterator(Person[] people){
        this.people = people;
    }

    public Person next(){
        Person person = people[position];
        position++;
        return person;
    }

    public boolean hasNext(){
        if (position >= people.length || people[position] == null){
            return false;
        } else {
            return true;
        }
    }
}
