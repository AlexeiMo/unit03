package by.epam.java_intro.classes;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> list;
    public Group() {
        this.list = new ArrayList<>();
    }
    public Group(List<Student> list) {
        this.list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            this.list.add(list.get(i));
        }
    }

    public void addStudent(Student st) {
        list.add(st);
    }
    public Student removeStudent() {
        Student st = list.remove(list.size()-1);
        return st;
    }

    public void setList(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            this.list.add(list.get(i));
        }
    }

    public List<Student> getList() {
        return list;
    }
}
