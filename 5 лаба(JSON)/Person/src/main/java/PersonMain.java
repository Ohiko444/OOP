import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Доцент", "Moscow, Red Square, 02", "1952-02-29", true, 15);

        ObjectMapper mapper = new ObjectMapper();

        try{
            mapper.writeValue(new File("Person.json"), person);
        } catch (IOException error){
            error.printStackTrace();
        }

        try{
            Person person1 = mapper.readValue(new File("Person.json"), Person.class);
            System.out.println(person1);
        } catch (IOException error){
            error.printStackTrace();
        }
    }
}
