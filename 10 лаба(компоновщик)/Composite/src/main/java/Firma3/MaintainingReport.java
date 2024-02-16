package Firma3;

import lombok.Data;

import java.util.*;

@Data
public class MaintainingReport extends Basic {

    public ArrayList<Basic> basics = new ArrayList<>();
    String description;
    double salary = 0;
    String name;
    String post;

    public MaintainingReport(String description){
        this.description = description;
    }

    public MaintainingReport(String name, double salary, String post){
        this.name = name;
        this.salary = salary;
        this.post = post;
    }

    @Override
    public void add(Basic employee){
        basics.add(employee);
    }

    @Override
    public void remove(Basic employee) {
        basics.remove(employee);
    }

    public void print(){

        Iterator<Basic> iterator = basics.iterator();
        while (iterator.hasNext()){
            Basic basic = iterator.next();
            if (getDescription().length() > 0) {
                if (getDescription().charAt(0) == '1') {
                    System.out.println(getDescription() + " 100% надбавка ");
                } else if (getDescription().charAt(0) == '2') {
                    System.out.println(getDescription() + " 50% надбавка  ");
                } else if (getDescription().charAt(0) == '3') {
                    System.out.println(getDescription() + " 25% надбавка ");
                } else if (getDescription().charAt(0) == '4') {
                    System.out.println(getDescription() + " 12.5% надбавка ");
                } else if (getDescription().charAt(0) == '5') {
                    System.out.println(getDescription() + " 6.25% надбавка ");
                } else {
                    System.out.print(getDescription());
                }
            }
            basic.print();
        }
    }

    public String getPost(){
        Set<String> list = new HashSet<>();

        Iterator<Basic> iterator = basics.iterator();
        while (iterator.hasNext()){
            Basic basic = iterator.next();

            list.add(basic.getPost());
        }
        return String.join("\n**", list);
    }

    public double getSalary(){
        double allSalary = 0;

        Iterator<Basic> iterator = basics.iterator();
        while (iterator.hasNext()){
            Basic basic = iterator.next();

            allSalary += basic.getSalary();
        }
        return allSalary;
    }
}
