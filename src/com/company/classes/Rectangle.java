package com.company.classes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length > 0)
            this.length = length;
        if (width > 0)
            this.width = width;
    }

    public Rectangle() {
        length = 10;
        width = 15;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
    }
    public double getPerimetr(){
        return (length + width)*2;
    }
    public double getSquare(){
        return length * width;
    }
}
