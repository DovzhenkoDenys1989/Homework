package com.company;

public class Car {
    private double price;
    private String brand;
    private String model;
    private Body body;
    private Engine engine;
    private Transmission transmission;

    public Car(double price, String brand, String model, Body body, Engine engine, Transmission transmission) {
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", body=" + body +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }
}
