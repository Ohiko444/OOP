package Firma3.Vasya.John;

import Firma3.Vasya.DeveloperJohn;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class TeamlidPetya extends DeveloperJohn {

    private @Getter @NonNull String name = "Петя";
    private @Getter @NonNull double salary = 180_000;
    private @Getter @NonNull String post = "Тимлид";

    public TeamlidPetya(){
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