package Firma3;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class DirectorVasya extends BasicEmployee {

    private @Getter @NonNull String name = "Вася";
    private @Getter @NonNull double salary = 400_000;
    private @Getter @NonNull String post = "Генеральный директор";

    public DirectorVasya(){
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
