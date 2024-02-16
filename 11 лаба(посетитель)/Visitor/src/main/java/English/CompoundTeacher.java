package English;

import java.util.ArrayList;
import java.util.List;

public class CompoundTeacher implements Teacher {

    public String post;
    public List<Teacher> teachers = new ArrayList<>();

    public CompoundTeacher(String post) {
        this.post = post;
    }

    public String getId() {
        return post;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundTeacher(this);
    }

    public void add(Teacher teacher) {
        teachers.add(teacher);
    }


}
