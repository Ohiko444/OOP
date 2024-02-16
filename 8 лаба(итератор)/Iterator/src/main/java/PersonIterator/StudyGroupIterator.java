package PersonIterator;

import java.util.Iterator;

public class StudyGroupIterator implements Iterator<Person> {

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


    public void remove(int index) {
        position = 0;
        if (index < 0 || index > people.length - 1) {
            throw new IllegalStateException("Вы не можете удалить объект, поскольку индекс выходит за пределы массива");
        }
        for (int i = index; i < people.length - 1; i++) {
            people[i] = people[i + 1];
        }
        people[people.length - 1] = null;
    }
}
