import by.epam.java_intro.classes.*;
import by.epam.java_intro.logic.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{5,7,9,4,10}, {9,10,10,9,10}, {5,4,8,2,9}, {9,10,10,9,10}, {5,7,9,4,10}, {8,8,8,8,8}, {3,6,9,5,4}, {10,10,10,10,10}, {9,7,8,6,5}, {9,9,9,9,7}};
        String[] names = {"Ivanov I. I.", "Petrov P.P.", "Sidorov S.S.", "Konev I.P.", "Stalin I.V.", "Vlasov A.P.", "Pushkin A.S.", "Trumph D.J.", "Obama B.P.", "Moshko A.A."};
        String[] nums = {"750504", "958764", "880055", "775498", "124578", "886459", "442687", "222654", "978564", "723468"};
        /*Group group = new Group();
        for (int i = 0; i < 9; i++) {
            group.addStudent(new Student(names[i], nums[i], arr[i]));
        }
        List<Student> list = GroupLogic.getGoodStudents(group);
        for (Student elem: list) {
            System.out.println(elem.getName() + " " + elem.getGroupNum());
        }*/

        String[] dests = {"Minsk", "Grodno", "Minsk", "Lida", "Gomel"};
        String[] departTimes = {"11:20", "9:45", "18:30", "20:25", "8:00"};
        /*Train[] trains = new Train[5];
        trains[0] = new Train(dests[0], nums[0], departTimes[0]);
        trains[1] = new Train(dests[1], nums[1], departTimes[1]);
        trains[2] = new Train(dests[2], nums[2], departTimes[2]);
        trains[3] = new Train(dests[3], nums[3], departTimes[3]);
        trains[4] = new Train(dests[4], nums[4], departTimes[4]);
        Train.sortByDest(trains);
        for (Train elem:trains) {
            System.out.println(elem.getDest() + " " + elem.getTrainNum() + " " + elem.getDepartTime());
        }*/

        /*Counter counter = new Counter();
        System.out.println(counter.getValue());
        counter.setValue(156);
        System.out.println(counter.getValue());
        counter.setValue(-56);
        System.out.println(counter.getValue());
        counter.increase();
        counter.increase();
        counter.increase();
        System.out.println(counter.getValue());
        counter.decrease();
        System.out.println(counter.getValue());*/

        /*Time time = new Time();
        System.out.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());
        time = new Time(5,48,30);
        System.out.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());
        time.plusHours(20);
        time.plusMinutes(12);
        time.minusSeconds(40);
        System.out.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());*/


    }
}