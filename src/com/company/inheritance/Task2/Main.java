package com.company.inheritance.Task2;

public class Main {
    public static void main(String[] args) {
        SteeringWheel steeringWheel = new SteeringWheel(20, 30, "right");
        Wheel wheel = new Wheel(50, 1000, "silver");
        Body body = new Body(10, "yellow", 4);
        Car car = new Car(steeringWheel, wheel, body);
        car.start();
        System.out.println(car.toString());
    }
}
