package ru.stqa.my1stPr.sandbox;

public class Exemple_Light {
    public static void main (String [] args) {

        int light_speed;
        long days;
        long seconds;
        long distance;

        light_speed = 186000; //��������������� �������� �����, ����/�������
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = light_speed * seconds;
        System.out.print("�� " + days + " ����, ���� ������� ����� " + distance + " ����"); // �� �������, ����� ��� ������
    }
}
