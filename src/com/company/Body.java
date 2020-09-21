package com.company;

public class Body {
    private String type01;
    private String color;

    public Body(String type01, String color) {
        this.type01 = type01;
        this.color = color;
    }


    public String getType01() {
        return type01;
    }

    public void setType01(String type01) {
        this.type01 = type01;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type01='" + type01 + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


