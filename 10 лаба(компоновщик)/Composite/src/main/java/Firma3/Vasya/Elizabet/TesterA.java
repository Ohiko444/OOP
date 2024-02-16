package Firma3.Vasya.Elizabet;

import Firma3.Vasya.ElizabetTester;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class TesterA extends ElizabetTester {

    private @Getter @NonNull String name = "'Засекреченый' А";
    private @Getter @NonNull double salary = 80_000;
    private @Getter @NonNull String post = "Тестировщик";

    public TesterA(){
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
