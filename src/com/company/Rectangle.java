package com.company;/*
@USER: dench
@DATE: 13.03
@NAME: Rectangle
@TIME: 10:34
*/

public class Rectangle {
    //Определение полей
    private int length;
    private int widht;

    public Rectangle(int length, int widht) {
        this.length = length;
        this.widht = widht;
    }

    public Rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }
    public int getArea(){
        return widht*length;
    }
    public static int getArea(int widht,int length){
        return widht*length;
    }

    @Override
    public String toString() {
        return "Rectangle is " + "\n" +
                "length = " + length + "\n" +
                "widht = " + widht ;
    }
    public int getPerimetr(){
        return widht * 2 + length * 2;
    }
    public double getDiagonal(){
        return Math.sqrt(widht * widht + length * length);
    }
}
