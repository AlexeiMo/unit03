package by.epam.java_intro.classes;
//2. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время
//отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность
//сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде,
//номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения,
//причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени
//отправления.

public class Train {
    private String dest;
    private String num;
    private String departTime;

    public Train() {
        dest = "None";
        num = "None";
        departTime = "00:00";
    }
    public Train(String dest, String num, String departTime) {
        this.dest = dest;
        this.num = num;
        this.departTime = departTime;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getDest() {
        return dest;
    }

    public String getNum() {
        return num;
    }

    public String getDepartTime() {
        return departTime;
    }



    public static void printByNum(Train[] trains, String num) {
        int flag = 1;
        for (int i = 0; i < trains.length; i++) {
            if(trains[i].num == num) {
                flag = 0;
                System.out.println("Train to " + trains[i].dest + " #" + trains[i].num + " departed at " + trains[i].departTime);
            }
        }
        if(flag == 1) {
            System.out.println("No matches");
        }
    }
}