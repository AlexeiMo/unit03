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

}