package com.company.inheritance.Task2;

public class Car {
    SteeringWheel steeringWheel;
    Wheel wheel;
    Body body;

    public Car(SteeringWheel steeringWheel, Wheel wheel, Body body) {
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.body = body;
    }
    public void start(){
        steeringWheel.doubleTurnSpeed();
        steeringWheel.turnLeft();
        System.out.println(steeringWheel.toString());
        wheel.rotate();
        body.brokeDoor();
        System.out.println(body.toString());

    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steeringWheel=" + steeringWheel.toString() +
                ", wheel=" + wheel.toString() +
                ", body=" + body.toString() +
                '}';
    }
}
