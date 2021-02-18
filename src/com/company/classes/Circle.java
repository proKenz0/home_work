package com.company.classes;

public class Circle {
    private double radius;
    private double diameter;
    private final double P = 3.14;
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
            this.diameter = radius * 2;
        }
    }
    public void printLength(){
        double l = 2*P*radius;
        System.out.println("l = " + l);
    }
    public void printSquare(){
        double square = P*(diameter/2)*(diameter/2);
        System.out.println("square = " + square);
    }

}
