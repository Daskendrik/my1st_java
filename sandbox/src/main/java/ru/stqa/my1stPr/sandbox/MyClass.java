package ru.stqa.my1stPr.sandbox;

public class MyClass {

    private int mass;
    private int height;
    public int power;


    public MyClass(int mass, int height, int power){
        this.mass = mass;
        this.height = height;
        this.power = power;
    }

    public void printParams(){
        System.out.println("Mass: " + mass +"\nHeight: " + height + "\nPower: " + power);
    }

    public void setHeight(int height) {
        if(height < 0){
            System.out.println("Error");
            System.out.println(this.height);
        }
        else{
            this.height = height;
            System.out.println(this.height);
        }
    }
}
