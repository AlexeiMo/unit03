package by.epam.java_intro.logic;

import by.epam.java_intro.classes.Group;
import by.epam.java_intro.classes.Student;
import java.util.ArrayList;
import java.util.List;

public class GroupLogic {
    public static List<Student> getGoodStudents(Group group) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < group.getList().size(); i++) {
            if(StudentLogic.isGoodStudent(group.getList().get(i))) {
                result.add(group.getList().get(i));
            }
        }
        return result;
    }
}
