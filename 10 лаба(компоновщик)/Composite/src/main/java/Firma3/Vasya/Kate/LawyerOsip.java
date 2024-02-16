package Firma3.Vasya.Kate;

import Firma3.Vasya.AdministratorKate;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class LawyerOsip extends AdministratorKate {

    private @Getter @NonNull String name = "Осип Абрамович";
    private @Getter @NonNull double salary = 40_000;
    private @Getter @NonNull String post = "Юрист";

    public LawyerOsip(){
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