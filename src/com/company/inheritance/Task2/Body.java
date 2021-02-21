package com.company.inheritance.Task2;

public class Body {
    private double size;
    private String color;
    private int numOfDoors;

    public Body(double size, String color, int numOfDoors) {
        this.size = size;
        this.color = color;
        this.numOfDoors = numOfDoors;
    }

    public void brokeDoor(){
        --numOfDoors;
    }
    public void repairDoor(){
        ++numOfDoors;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String toString() {
        return "Body{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", numOfDoors=" + numOfDoors +
                '}';
    }
}
