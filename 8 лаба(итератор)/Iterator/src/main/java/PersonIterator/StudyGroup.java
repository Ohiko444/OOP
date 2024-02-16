package PersonIterator;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class StudyGroup implements Spisok {

    static final int MAX_ITEMS = 5;
    Person[] students;

    public StudyGroup(){
        ObjectMapper mapper = new ObjectMapper();
        students = new Person[MAX_ITEMS];

        try{
            students = mapper.readValue(new File("students.json"), Person[].class);
        } catch (IOException error){
            error.printStackTrace();
        }
    }

    public void replacement(){
        students[0] = new Person("Вася", 19);
    }

    public Iterator<Person> createIterator(){
        return new StudyGroupIterator(students);
    }
}
