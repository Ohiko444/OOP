package Firma3.Vasya.Kate;

import Firma3.Vasya.AdministratorKate;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class HRNatalya extends AdministratorKate {

    private @Getter @NonNull String name = "Наталья Борисовна";
    private @Getter @NonNull double salary = 40_000;
    private @Getter @NonNull String post = "HR";

    public HRNatalya(){
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