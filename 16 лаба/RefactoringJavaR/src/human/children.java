package human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class children extends Human {
    private int numberOfStudents;
    private String university;
    private List<Human> children = new ArrayList<>();

    public children(String name, int age, int numberOfStudents) {
        super(false);
        this.name = name;
        this.age = age;
        this.numberOfStudents = numberOfStudents;
    }


    public void live() {
        teach();
    }

    public void teach() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void printData() {
        System.out.println("Преподаватель: " + name);
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }
}
