package by.epam.java_intro.classes;
//3. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое
//значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по
//умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
//и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
//возможности класса.

public class Counter {
    private int value;
    public Counter() {
        this.value = 0;
    }
    public Counter(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        if(value > 99) {
            this.value = 99;
            return;
        }
        else if(value < 0) {
            this.value = 0;
            return;
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
        if(value > 99) {
            value = 0;
        }
    }
    public void decrease() {
        value--;
        if(value < 0) {
            value = 0;
        }
    }
}
