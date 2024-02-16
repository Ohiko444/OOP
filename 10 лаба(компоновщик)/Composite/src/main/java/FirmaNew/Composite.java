package FirmaNew;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Composite extends Component{

    ArrayList<Component> components = new ArrayList<>();
    Set<String> list = new HashSet<>();
    public String description;
    public String name;
    public double salary;
    public String post;

    public Composite(String description, String name, double salary, String post){
        this.description = description;
        this.name = name;
        this.salary = salary;
        this.post = post;
    }

    public String name() {
        return name;
    }

    public double salary() {
        return salary;
    }

    public String post() {
        return post;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    public void removeComponent(Component component){
        components.remove(component);
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println(getDescription() + name() + " " + salary() + " " + post());
        Iterator<Component> iterator = components.iterator();
        while (iterator.hasNext()){
            Component component = iterator.next();
            component.print();
        }
    }

    public String allPost(){
        Iterator<Component> iterator = components.iterator();
        list.add(post());
        while (iterator.hasNext()){
            Component component = iterator.next();
            list.add(component.allPost());
        }
        return String.join("\n**", list);
    }

    public double allSalary(){
        double allSalary = 0;
        allSalary += salary();
        Iterator<Component> iterator = components.iterator();
        while (iterator.hasNext()){
            Component component = iterator.next();

            allSalary += component.allSalary();
        }
        return allSalary;
    }
}
