package ru.stqa.my1stPr.sandbox;

public class Exemple_block {
    public static void main (String[] args) {

        int x,y;
        y = 20;
        for (x = 0; x<10; x++) {//Открытие блока (адресат оператора)
            System.out.println("Значение х:" + x);
            System.out.println("Значение y:" + y);
            if ( y == 10) System.out.println("Тадаааам, y = 10! А теперь самое время!"); // Эксперемент для понятия, куда деть строчку
            y = y - 2;
            if ( y == 10) System.out.println("Тадаааам, y = 10! Но так будет рано говорить, спойлер = ("); // Эксперемент для понятия, куда деть строчку
        }//Закрытие блока
    }
}
