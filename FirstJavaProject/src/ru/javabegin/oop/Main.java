package ru.javabegin.oop;
import ru.javabegin.oop.model.car.Car;
import ru.javabegin.oop.model.details.Engine;
import ru.javabegin.oop.model.motorbike.Kawasaki;
import ru.javabegin.oop.model.motorbike.Motorbike;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(10);

        Car car = new Car(11111111, engine);
        System.out.println("car.getEngine().getVolume() = " + car.getEngine());
        System.out.println("car = " + car.wheelCount);

        Kawasaki kawasaki = new Kawasaki("Kawa", "123", "black", 2);
        System.out.println(kawasaki);


    }
}
