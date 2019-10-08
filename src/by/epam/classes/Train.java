package by.epam.classes;
//2. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время
//отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность
//сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде,
//номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения,
//причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени
//отправления.

public class Train {
    private String dest;
    private String trainNum;
    private String departTime;

    public Train() {
        dest = "None";
        trainNum = "None";
        departTime = "00:00";
    }
    public Train(String dest, String trainNum, String departTime) {
        this.dest = dest;
        this.trainNum = trainNum;
        this.departTime = departTime;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getDest() {
        return dest;
    }

    public String getTrainNum() {
        return trainNum;
    }

    public String getDepartTime() {
        return departTime;
    }

    public static Train[] sortByNum(Train[] trains) {
        boolean isSorted = false;
        Train buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < trains.length-1; i++) {
                if(Integer.parseInt(trains[i].trainNum) > Integer.parseInt(trains[i+1].trainNum)){
                    isSorted = false;
                    buf = trains[i];
                    trains[i] = trains[i+1];
                    trains[i+1] = buf;
                }
            }
        }
        return trains;
    }

    public static void printByNum(Train[] trains, String trainNum) {
        int flag = 1;
        for (int i = 0; i < trains.length; i++) {
            if(trains[i].trainNum == trainNum) {
                flag = 0;
                System.out.println("Train to " + trains[i].dest + " #" + trains[i].trainNum + " departed at " + trains[i].departTime);
            }
        }
        if(flag == 1) {
            System.out.println("No matches");
        }
    }

    public static Train[] sortByDest(Train[] trains) {
        boolean isSorted = false;
        Train buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < trains.length-1; i++) {
                if((trains[i].dest.compareTo(trains[i+1].dest) > 0 ) ||
                        (trains[i].dest.compareTo(trains[i+1].dest) == 0) &&
                                (trains[i].departTime.compareTo(trains[i+1].departTime) >= 1 )) {
                    isSorted = false;
                    buf = trains[i];
                    trains[i] = trains[i+1];
                    trains[i+1] = buf;
                }
            }
        }
        return trains;
    }
}