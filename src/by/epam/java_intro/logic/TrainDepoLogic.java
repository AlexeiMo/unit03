package by.epam.java_intro.logic;

import by.epam.java_intro.classes.Train;
import by.epam.java_intro.classes.TrainDepo;

public class TrainDepoLogic {
    public static TrainDepo sortByNum(TrainDepo depo) {
        boolean isSorted = false;
        Train buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < depo.getList().size()-1; i++) {
                if (Integer.parseInt(depo.getList().get(i).getNum()) > Integer.parseInt(depo.getList().get(i+1).getNum())) {
                    isSorted = false;
                    buf = depo.getList().remove(i);
                    depo.getList().set(i+1, buf);
                }
            }
        }
        return depo;
    }
    public static TrainDepo sortByDest(TrainDepo depo) {
        boolean isSorted = false;
        Train buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < depo.getList().size()-1; i++) {
                if(depo.getList().get(i).getDest().compareTo(depo.getList().get(i+1).getDest()) > 0  ||
                        ((depo.getList().get(i).getDest().compareTo(depo.getList().get(i+1).getDest()) == 0) &&
                                (depo.getList().get(i).getDepartTime().compareTo(depo.getList().get(i+1).getDepartTime()) >= 1 ))) {
                    isSorted = false;
                    buf = depo.getList().remove(i);
                    depo.getList().set(i+1, buf);
                }
            }
        }
        return depo;
    }
}