package com.company;

public class Rectangle {

    private double x;
    private double y;
    private static int createdRectangles;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    // Создание конструктора для прямоугольника
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;

    }

    // Создание конструктора для квадрата
    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles++;
    }

    // Создание метода по подсчету площади
    public double calculateArea() {
        double area = x * y;
        return area;

    }

    // Создание метода по выводу площади текущей фигуры
    public void printArea() {
        System.out.print("Площадь фигуры: " + calculateArea());
    }

    // Создние метода по выводу типа фигуры
    public void printRectangleKind() {
        if (x == y) {
            System.out.print("; Это квадрат;");
        } else System.out.print("; Это прямоугольник;");
    }

    // Создание метода по сравнению прямоугольников

    public boolean isTheSameRectangle(Rectangle rectangle) {
        return this.x == rectangle.x && this.y == rectangle.y;
    }


    // Статический метод по подсчету фигур
    public static void printRectanglesCount() {
        System.out.println("Всего было создано [" + Rectangle.createdRectangles + "] прямоугольников");
    }

    // Название клааса на русском или английком языке в зависимости от значения аргумента типа boolean
    static boolean printClassName(boolean printInRussian) {
       if (printInRussian) {
            System.out.println("Имя класса: " + RUSSIAN_CLASS_NAME);}
       else System.out.println("Имя класса: " +  ENGLISH_CLASS_NAME);
       return printInRussian;


    }


}


