package Firma3.Vasya;

import Firma3.DirectorVasya;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;


@Data
public class DeveloperJohn extends DirectorVasya {

    private @Getter @NonNull String name = "Джон";
    private @Getter @NonNull double salary = 250_000;
    private @Getter @NonNull String post = "Разработчик";

    public DeveloperJohn(){
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