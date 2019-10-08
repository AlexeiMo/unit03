package by.epam.classes;
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

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }
    public void decrease() {
        value--;
    }
}
