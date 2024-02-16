package Firma3.Vasya.John.Petya;

import Firma3.Vasya.John.TeamlidPetya;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class BackendLesha extends TeamlidPetya {
    private @Getter
    @NonNull String name = "Лёша";
    private @Getter @NonNull double salary = 100_000;
    private @Getter @NonNull String post = "Бэкенд разработчик";

    public BackendLesha(){
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
