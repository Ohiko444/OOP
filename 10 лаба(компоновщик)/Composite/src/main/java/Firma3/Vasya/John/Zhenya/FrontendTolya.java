package Firma3.Vasya.John.Zhenya;

import Firma3.Vasya.John.TeamlidZhenya;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class FrontendTolya extends TeamlidZhenya {

    private @Getter
    @NonNull String name = "Толя";
    private @Getter @NonNull double salary = 90_000;
    private @Getter @NonNull String post = "Фронтенд разработчик";

    public FrontendTolya(){
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