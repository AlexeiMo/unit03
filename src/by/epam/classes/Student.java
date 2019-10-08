package by.epam.classes;
//1. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
//успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте
//возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {
    private String name;
    private String groupNum;
    private int[] marks;

    public Student() {
        this.name = "None";
        this.groupNum = "None";
        this.marks = new int[]{0,0,0,0,0};
    }

    public Student(String name, String groupNum, int[] marks) {
        this.name = name;
        this.groupNum = groupNum;
        this.marks = new int[5];
        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public void setMarks(int[] marks) {
        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }
    }

    public String getName() {
        return this.name;
    }

    public String getGroupNum() {
        return this.groupNum;
    }

    public int[] getMarks() {
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = this.marks[i];
        }
        return marks;
    }

    public boolean IsGood() {
        for (int i = 0; i < this.marks.length; i++) {
            if(this.marks[i] < 9) {
                 return false;
            }
        }
        return true;
    }

    public static void printGoogStuds(Student[] studs) {
        for (int i = 0; i < studs.length; i++) {
            if(studs[i].IsGood()) {
                System.out.println("Student " + studs[i].name + " from group #" + studs[i].groupNum + ".");
            }
        }
    }
}
