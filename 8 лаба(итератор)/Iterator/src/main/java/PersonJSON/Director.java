package PersonJSON;

import java.util.ArrayList;

public class Director {
    SportsTeam sportsTeam;
    StudyGroup studyGroup;

    public Director(StudyGroup studyGroup, SportsTeam sportsTeam){
        this.studyGroup = studyGroup;
        this.sportsTeam = sportsTeam;
    }

    public void printLists(){
        Iterator studyIterator = studyGroup.createIterator();
        Iterator sportIterator = sportsTeam.createIterator();

        System.out.println("-----------------------------------------");
        System.out.println("Учебная группа:\n");
        printLists(studyIterator);

        System.out.println("-----------------------------------------");
        System.out.println("Спортивная команда:\n");
        printLists(sportIterator);
        System.out.println("-----------------------------------------");
    }

    private void printLists(Iterator iterator){
        int number = 1;
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(number + ". " + person.getName() + " " + person.getAge() + " лет + (возраст через год = " + (person.getAge() + 1) + ")");
            number++;
        }
    }
}
