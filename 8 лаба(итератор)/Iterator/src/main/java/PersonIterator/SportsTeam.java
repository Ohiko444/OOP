package PersonIterator;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SportsTeam {
    ArrayList<Person> sportsmans;

    public SportsTeam(){
        ObjectMapper mapper = new ObjectMapper();

        try{
            sportsmans = mapper.readValue(new File("sportsmans.json"), mapper.getTypeFactory().constructCollectionType(List.class, Person.class));
        } catch (IOException error){
            error.printStackTrace();
        }
    }

    public void replacement(){
        Person person = new Person("Вася", 19);
        sportsmans.set(0, person);
    }

    public Iterator<Person> createIterator(){
        return sportsmans.iterator();
    }}
