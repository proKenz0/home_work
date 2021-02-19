package com.company.inheritance.Task2;

public class Wheel {
    private double diameter;
    private double rotationalSpeed;
    private String diskColor;

    public Wheel(double diameter, double rotationalSpeed, String diskColor) {
        this.diameter = diameter;
        this.rotationalSpeed = rotationalSpeed;
        this.diskColor = diskColor;
    }

    public void rotate(){
        System.out.println("Wheels start rotation.");
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRotationalSpeed() {
        return rotationalSpeed;
    }

    public void setRotationalSpeed(double rotationalSpeed) {
        this.rotationalSpeed = rotationalSpeed;
    }

    public String getDiskColor() {
        return diskColor;
    }

    public void setDiskColor(String diskColor) {
        this.diskColor = diskColor;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", rotationalSpeed=" + rotationalSpeed +
                ", diskColor='" + diskColor + '\'' +
                '}';
    }
}
