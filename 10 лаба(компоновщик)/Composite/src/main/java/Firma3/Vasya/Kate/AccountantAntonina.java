package Firma3.Vasya.Kate;

import Firma3.Vasya.AdministratorKate;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class AccountantAntonina extends AdministratorKate {

    private @Getter @NonNull String name = "Антонина Николаевна";
    private @Getter @NonNull double salary = 48_000;
    private @Getter @NonNull String post = "Бухгалтер";

    public AccountantAntonina(){
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