package Firma3.Vasya.John;

import Firma3.Vasya.DeveloperJohn;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class TeamlidZhenya  extends DeveloperJohn {

    private @Getter @NonNull String name = "Женя";
    private @Getter @NonNull double salary = 180_000;
    private @Getter @NonNull String post = "Тимлид";

    public TeamlidZhenya(){
        super();
    }

    public String name(){
        return name;
    }

    public double salary(){
        return salary;
    }

    public String post(){
        return post;
    }

}