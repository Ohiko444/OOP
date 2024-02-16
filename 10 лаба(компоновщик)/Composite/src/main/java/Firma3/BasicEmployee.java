package Firma3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicEmployee extends Basic {

    public String name;
    public double salary;
    public String post;

    public String name(){
        return name;
    }

    public double salary(){
        return salary;
    }

    public String post(){
        return post;
    }

    public void print(){
        System.out.println(name() + " " + salary() + " " + post());
    }

    public double getSalary(){return salary();}

    public String getPost() {return post();}
}
