package PersonIterator;

import java.util.Iterator;

public class Director {
    SportsTeam sportsTeam;
    StudyGroup studyGroup;

    public Director(StudyGroup studyGroup, SportsTeam sportsTeam){
        this.studyGroup = studyGroup;
        this.sportsTeam = sportsTeam;
    }

    public void printLists(){
        Iterator<Person> studyIterator = studyGroup.createIterator();
        Iterator<Person> sportIterator = sportsTeam.createIterator();

        System.out.println("-----------------------------------------");
        System.out.println("Учебная группа:\n");
        printLists(studyIterator);

        System.out.println("-----------------------------------------");
        System.out.println("Спортивная команда:\n");
        printLists(sportIterator);
        System.out.println("-----------------------------------------");
    }

    private void printLists(Iterator<Person> iterator){
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.getName() + " " + person.getAge() + " лет");
        }
    }
}
