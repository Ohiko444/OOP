package Firma3.Vasya.John.Zhenya;

import Firma3.Vasya.John.TeamlidZhenya;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class FrontendDasha extends TeamlidZhenya {

    private @Getter
    @NonNull String name = "Даша";
    private @Getter @NonNull double salary = 90_000;
    private @Getter @NonNull String post = "Фронтенд разработчик";

    public FrontendDasha(){
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