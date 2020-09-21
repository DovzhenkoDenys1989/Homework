package com.company;

public class Engine {
    private String type02;
    private double power;

    public Engine(String type02, double power) {
        this.type02 = type02;
        this.power = power;
    }

    public String getType02() {
        return type02;
    }

    public void setType02(String type02) {
        this.type02 = type02;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type02='" + type02 + '\'' +
                ", power=" + power +
                '}';
    }
}
