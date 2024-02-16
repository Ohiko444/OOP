package PersonJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

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

    public Iterator createIterator(){
        return new StudyGroupIterator(students);
    }
}
