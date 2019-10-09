package by.epam.java_intro.view;

import by.epam.java_intro.classes.TrainDepo;

public class TrainDepoView {
    public static void printByNum(TrainDepo depo, String num) {
        int flag = 1;
        for (int i = 0; i < depo.getList().size(); i++) {
            if(depo.getList().get(i).getNum().compareTo(num) == 0) {
                flag = 0;
                System.out.println("Train to " + depo.getList().get(i).getDest() + " #" + depo.getList().get(i).getNum() + " departed at " + depo.getList().get(i).getDepartTime());
            }
        }
        if(flag == 1) {
            System.out.println("No matches");
        }
    }
}
