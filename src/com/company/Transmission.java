package com.company;

public class Transmission {
    private String type03;
    private int gear;

    public Transmission(String type03, int gear) {
        this.type03 = type03;
        this.gear = gear;
    }

    public String getType03() {
        return type03;
    }

    public void setType03(String type03) {
        this.type03 = type03;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type03='" + type03 + '\'' +
                ", gear=" + gear +
                '}';
    }
}
