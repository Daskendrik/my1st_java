package ru.stqa.my1stPr.sandbox;

public class Exemple_block {
    public static void main (String[] args) {

        int x,y;
        y = 20;
        for (x = 0; x<10; x++) {//�������� ����� (������� ���������)
            System.out.println("�������� �:" + x);
            System.out.println("�������� y:" + y);
            if ( y == 10) System.out.println("��������, y = 10! � ������ ����� �����!"); // ����������� ��� �������, ���� ���� �������
            y = y - 2;
            if ( y == 10) System.out.println("��������, y = 10! �� ��� ����� ���� ��������, ������� = ("); // ����������� ��� �������, ���� ���� �������
        }//�������� �����
    }
}
