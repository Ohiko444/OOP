package PersonIterator;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Scanner;

@JsonAutoDetect
public class Person{
    private String name;
    private int age;

    Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void read(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите имя: ");
        this.name = inp.nextLine();
        System.out.print("Введите возраст: ");
        this.age = inp.nextInt();
        System.out.println("-----------------------------------------");
    }



    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
