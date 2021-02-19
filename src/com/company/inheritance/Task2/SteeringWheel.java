package com.company.inheritance.Task2;

public class SteeringWheel {
    private double diameter;
    private double turnSpeed;
    private String direction;

    public SteeringWheel(double diameter, double turnSpeed, String direction) {
        this.diameter = diameter;
        this.turnSpeed = turnSpeed;
        this.direction = direction;
    }

    public void turnLeft(){
        direction = "left";
    }
    public void turnRight(){
        direction = "right";
    }
    public void goAhead(){
        direction = "ahead";
    }
    public void goBack(){
        direction = "back";
    }


    public void doubleTurnSpeed(){
        turnSpeed *= 2;
    }
    public void halveTurnSpeed(){
        turnSpeed /= 2;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getTurnSpeed() {
        return turnSpeed;
    }

    public void setTurnSpeed(double turnSpeed) {
        this.turnSpeed = turnSpeed;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                ", turnSpeed=" + turnSpeed +
                ", direction='" + direction + '\'' +
                '}';
    }
}
