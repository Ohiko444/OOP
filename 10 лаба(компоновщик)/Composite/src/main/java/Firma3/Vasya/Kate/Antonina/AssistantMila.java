package Firma3.Vasya.Kate.Antonina;

import Firma3.Vasya.Kate.AccountantAntonina;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class AssistantMila extends AccountantAntonina {

    private @Getter @NonNull String name = "Мила";
    private @Getter @NonNull double salary = 30_000;
    private @Getter @NonNull String post = "Помощник бухгалтера";

    public AssistantMila(){
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