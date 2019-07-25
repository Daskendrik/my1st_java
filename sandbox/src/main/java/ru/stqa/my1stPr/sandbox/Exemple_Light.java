package ru.stqa.my1stPr.sandbox;

public class Exemple_Light {
    public static void main (String [] args) {

        int light_speed;
        long days;
        long seconds;
        long distance;

        light_speed = 186000; //Приблизительная скорость света, миль/секунду
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = light_speed * seconds;
        System.out.print("За " + days + " дней, свет пройдет около " + distance + " миль"); // не понимаю, зачем тут делило
    }
}
