package by.epam.java_intro.logic;

import by.epam.java_intro.classes.Student;

public class StudentLogic {
    public static boolean isGoodStudent(Student st) {
        int[] marks = st.getMarks();
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] < 9) {
                return false;
            }
        }
        return true;
    }
}