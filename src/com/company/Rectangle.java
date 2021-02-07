package com.company;

public class Rectangle {

 private double x;
 private double y;


        // Создание конструктора для прямоугольника
        public Rectangle (double x, double y){
            this.x = x;
            this.y = y;

        }

        // Создание конструктора для квадрата
        public  Rectangle (double x){
            this.x = x;
            this.y = x;
        }

        // Создание метода по подсчету площади
        public double calculateArea(){
            double area = x * y;
            return area;
        }

        // Создание метода по выводу площади текущей фигуры
        public void printArea (){
            System.out.print("Площадь фигуры: "+calculateArea());
        }

        // Создние метода по выводу типа фигуры
        public void printRectangleKind (){
            if (x == y){
                System.out.print("; Это квадрат;");
            }
            else System.out.print("; Это прямоугольник;");
        }

        // Срздание метода по сравнению прямоугольников

    public boolean isTheSameRectangle (Rectangle rectangle){
           return this.x == rectangle.x && this.y == rectangle.y;


    }




    }


