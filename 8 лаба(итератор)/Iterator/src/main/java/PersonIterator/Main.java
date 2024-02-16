package PersonIterator;

public class Main {
    public static void main(String[] args) {

        StudyGroup studyGroup = new StudyGroup();
        SportsTeam sportsTeam = new SportsTeam();

        Director director = new Director(studyGroup, sportsTeam);
        director.printLists();

        System.out.println("Данные с заменённым первым объектом");

        studyGroup.replacement();
        sportsTeam.replacement();
        director.printLists();
    }
}
