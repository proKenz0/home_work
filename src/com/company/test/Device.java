package com.company.test;


public class Device {

    private long serialNumbar;
    private String brand;
    private String info;
    private int price;

    public Device(long serialNumbar, String brand, String info, int price) {
        this.serialNumbar = serialNumbar;
        this.brand = brand;
        this.info = info;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "serialNumbar=" + serialNumbar +
                ", brand='" + brand + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                '}';
    }

    public long getSerialNumbar() {
        return serialNumbar;
    }

    public void setSerialNumbar(long serialNumbar) {
        this.serialNumbar = serialNumbar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
