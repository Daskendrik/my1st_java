package ru.stqa.my1stPr.sandbox;
// ������������ ��������� if
public class Exemple_If {
    public static void main (String[] agrs) {

        int x,y; //����, ����� 2 ���������� ��������
        x=10;
        y=20;

        if (x<y) System.out.println("x(" + x + ") ������ y(" + y + ")");

        x = x * 2;
        if (x==y) System.out.println("������ �("+ x + ") ����� �(" + y + ")");

        x = x * 2;
        if (x>y) System.out.println("x(" + x + ")������ ������ �(" + y + ")");
        if (x<y) System.out.println("����� �� ��� �� ������");

    }

}
