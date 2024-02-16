package FirmaNew;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends Component{

    public String description;
    public String name;
    public double salary;
    public String post;

    public String getDescription() {return description;}

    public String name() {
        return name;
    }

    public double salary() {
        return salary;
    }

    public String post() {
        return post;
    }

    public String allPost(){
        return post();
    }

    public double allSalary(){
        return salary();
    }

    public void print() {
        System.out.println(getDescription() + name() + " " + salary() + " " + post());
    }

}
