import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ActorsMain {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        System.out.println("Элементы простого массива:");
        try {
            Actors[] masActors = mapper.readValue(new File("Actors.json"), Actors[].class);
            for (Actors actorOne: masActors){
                System.out.println(actorOne);
            }
        } catch (IOException error){
            error.printStackTrace();
        }

        System.out.println("\nЭлементы динамического массива:");
        try {
            ArrayList<Actors> actors = mapper.readValue(new File("Actors.json"), mapper.getTypeFactory().constructCollectionType(List.class, Actors.class));
            System.out.println(actors);
        } catch (IOException error) {
            error.printStackTrace();
        }



    }
}
