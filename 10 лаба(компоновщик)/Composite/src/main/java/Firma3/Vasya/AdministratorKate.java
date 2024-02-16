package Firma3.Vasya;

import Firma3.DirectorVasya;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class AdministratorKate extends DirectorVasya {

    private @Getter @NonNull String name = "Кейт";
    private @Getter @NonNull double salary = 60_000;
    private @Getter @NonNull String post = "Администратор";

    public AdministratorKate(){
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