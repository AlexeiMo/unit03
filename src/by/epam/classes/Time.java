package by.epam.classes;
//4. Составьте описание класса для представления времени. Предусмотрте возможности установки
//времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых
//значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы
//изменения времени на заданное количество часов, минут и секунд.

import java.time.LocalTime;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = LocalTime.now().getHour();
        minute = LocalTime.now().getMinute();
        second = LocalTime.now().getSecond();
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour < 24) {
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute < 60) {
            this.minute = minute;
        }
        else {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        if(second >= 0 && second < 60) {
            this.second = second;
        }
        else {
            this.second = 0;
        }
    }

    public void plusHours(int hour) {
        setHour(24 % (this.hour + hour));
    }

    public void minusHours(int hour) {
        if((this.hour - hour) < 0) {
            setHour(24 + this.hour - hour);
        }
        else {
            setHour(this.hour-hour);
        }
    }

    public void plusMinutes(int minute) {
        setMinute(this.minute + minute);
    }

    public void minusMinutes(int minute) {
        if((this.minute - minute) < 0) {
            setMinute(60 + this.minute - minute);
        }
        else {
            setMinute(this.minute - minute);
        }
    }

    public void plusSeconds(int second) {
        setSecond(this.second + second);
    }

    public void minusSeconds(int second) {
        if((this.second - second) < 0) {
            setSecond(60 + this.second - second);
        }
        else {
            setSecond(this.second - second);
        }
    }
}