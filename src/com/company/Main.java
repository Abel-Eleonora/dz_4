package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2.5, 8);
        rectangle1.calculateArea();
        rectangle1.printArea();
        rectangle1.printRectangleKind();
        System.out.println(" Фигуры равны: " + rectangle1.isTheSameRectangle(rectangle1) + ";");

        Rectangle rectangle2 = new Rectangle(8);
        rectangle2.calculateArea();
        rectangle2.printArea();
        rectangle2.printRectangleKind();
        System.out.println(" Фигуры равны: " + rectangle2.isTheSameRectangle(rectangle1) + ";");

        Rectangle rectangle3 = new Rectangle(2, 8.8);
        rectangle3.calculateArea();
        rectangle3.printArea();
        rectangle3.printRectangleKind();
        System.out.println(" Фигуры равны: " + rectangle2.isTheSameRectangle(rectangle1) + ";");


    }
}
