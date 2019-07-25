package ru.stqa.my1stPr.sandbox;

public class Exemple1 {

    public static void main (String[] args) {

        int num; // в это строке кода объявляется переменная с именем num
        num = 100; // присваивается значение 100

        System.out.println("Это переменная num:" + num);
        num = num * 2;
        System.out.print("Значение переменной num * 2 равно ");// после выполнения кода этой строки перехода на новую строчку не будет
        System.out.println(num);// после выполнения кода этой строки переход на новую строчку  будет

    }

}
