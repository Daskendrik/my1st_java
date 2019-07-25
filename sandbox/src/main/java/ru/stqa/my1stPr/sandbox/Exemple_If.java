package ru.stqa.my1stPr.sandbox;
// ƒемонстраци€ оператора if
public class Exemple_If {
    public static void main (String[] agrs) {

        int x,y; //’оба, сразу 2 переменные объ€вили
        x=10;
        y=20;

        if (x<y) System.out.println("x(" + x + ") меньше y(" + y + ")");

        x = x * 2;
        if (x==y) System.out.println("теперь х("+ x + ") равно у(" + y + ")");

        x = x * 2;
        if (x>y) System.out.println("x(" + x + ")теперь больше у(" + y + ")");
        if (x<y) System.out.println("Ётого мы уже не увидим");

    }

}
