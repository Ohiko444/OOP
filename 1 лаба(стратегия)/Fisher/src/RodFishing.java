import java.util.ArrayList;

public class RodFishing implements Fishingable{


    ArrayList<String> mas = new ArrayList<>();

    public RodFishing (){}

    public void addEl(String name){
        mas.add(name);
    }

    public int fishing() {
        return random.nextInt(5, 20);
    }

    public ArrayList<String> getMas() {
        return mas;
    }
}
