package Cyberpunk2;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Person {

    public String name;
    public String status;
    public String belonging;
    public String description;
    public ArrayList<String> equipments = new ArrayList<String>();

    public void nickname() {
        System.out.println("Имя: " + name);
        System.out.println("Статус: " + status);
    }

    public void belonging() {
        System.out.println("Принадлежит к " + belonging);
    }

    public void description(){
        System.out.println("Описание:\n" + description);
    }

    public void equipment() {
        System.out.println("Оружие:");
        for (String equipment: equipments){
            System.out.println("***" + equipment);
        }
    }

    public String getDescription() {return description;}
    public String getBelonging() {return belonging;}
    public String getStatus() {return status;}
    public String getName() {return name;}
}
