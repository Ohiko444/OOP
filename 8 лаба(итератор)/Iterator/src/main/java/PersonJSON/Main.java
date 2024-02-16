package PersonJSON;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        StudyGroup studyGroup = new StudyGroup();
        SportsTeam sportsTeam = new SportsTeam();

        Director director = new Director(studyGroup, sportsTeam);
        director.printLists();

        System.out.println("Данные с заменённым первым объектом");

        studyGroup.replacement();
        sportsTeam.replacement();
        director.printLists();

        System.out.println("Данные с удалённым объектом");

        System.out.print("Введите номер ученика: ");
        int choice = inp.nextInt();
        Iterator iterator1 = sportsTeam.createIterator();
        iterator1.remove(choice-1);

        System.out.print("Введите номер спортсмена: ");
        choice = inp.nextInt();
        Iterator iterator2 = studyGroup.createIterator();
        iterator2.remove(choice-1);

        director.printLists();


    }
}
