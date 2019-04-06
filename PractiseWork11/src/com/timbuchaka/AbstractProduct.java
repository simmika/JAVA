package com.timbuchaka;

public abstract class AbstractProduct {

    private String name;
    private double price;

    public AbstractProduct(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithVat() {
        return this.getPrice() * this.getVat();
    }

    public abstract double getVat();
}
