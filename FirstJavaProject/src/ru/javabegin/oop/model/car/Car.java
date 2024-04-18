package ru.javabegin.oop.model.car;

import ru.javabegin.oop.Transport;
import ru.javabegin.oop.model.details.Engine;

public class Car extends Transport {

    private int number;
    private Engine engine;
    public final int wheelCount = 4;

    public Car(String name, String model, String color) {
        super(name, model, color); // перекидываем все значения в родит. конструктор
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car(int number, Engine engine) {
        this.number = number;
        this.engine = engine;
    }

    public Car() {
        System.out.println("car constructor");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void signal(){
        System.out.println("signal");
    }

    @Override
    public void drive() {
        System.out.println("drive car");
    }

    @Override
    public void stop() {
        System.out.println("stop car");
    }
}
