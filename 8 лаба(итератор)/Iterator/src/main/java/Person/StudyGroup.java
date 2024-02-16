package Person;

public class StudyGroup {

    static final int MAX_ITEMS = 5;
    Person[] students;
    int numberOfItems = 0;

    public StudyGroup(){
        students = new Person[MAX_ITEMS];

        addStudy("Дарья", 19);
        addStudy("Камиль", 19);
        addStudy("Анастасия", 20);
    }

    public void addStudy(String name, int age){
        Person person = new Person(name, age);

        if (numberOfItems >= MAX_ITEMS){
            System.out.println("Извините, класс переполнен");
        } else {
            students[numberOfItems] = person;
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new StudyGroupIterator(students);
    }
}
