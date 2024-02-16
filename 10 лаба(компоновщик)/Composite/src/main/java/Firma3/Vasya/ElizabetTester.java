package Firma3.Vasya;

import Firma3.DirectorVasya;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class ElizabetTester extends DirectorVasya {

    private @Getter @NonNull String name = "Элизабет";
    private @Getter @NonNull double salary = 110_000;
    private @Getter @NonNull String post = "Главный тестировщик";

    public ElizabetTester(){
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