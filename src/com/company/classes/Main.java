package com.company.classes;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(20,30);
        Rectangle rec2 = new Rectangle();
        System.out.println("Площа прямокутника = " + rec1.getSquare());
        System.out.println("Периметр прямокутника = " + rec1.getPerimetr());
        System.out.println("Площа прямокутника = " + rec2.getSquare());
        System.out.println("Периметр прямокутника = " + rec2.getPerimetr());

        Circle circle = new Circle(7);
        circle.printLength();
        circle.printSquare();

    }
}
