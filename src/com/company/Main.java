package com.company;

public class Main {

    public static void main(String[] args) {
        Body body = new Body("Хетчбек", "Зеленый");
        Engine engine = new Engine("Инжектор", 66);
        Transmission transmission = new Transmission("Механическая", 5);
       Car car = new Car(2500,"ЗАЗ", "1103",body,engine,transmission);
        System.out.println(car);

        car.setPrice(car.getPrice() + 2000);
        System.out.println(car);
        car.getBody().setColor("Черный");
        System.out.println(car);
        car.getEngine().setPower(engine.getPower()*(20)/100 + engine.getPower());
        System.out.println(car);
        car.getBody().setType01("Седан");
        System.out.println(car);
        car.getTransmission().setGear(transmission.getGear() + 1);
        System.out.println(car);
    }
}
