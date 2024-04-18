package ru.javabegin.oop.model.motorbike;

import ru.javabegin.oop.Transport;

public class Motorbike extends Transport {

    private double volume;
    private final int wheelCount;

    public Motorbike(String name, String model, String color, int wheelCount) {
        super(name, model, color);
        this.wheelCount = wheelCount;
    }

    //    public Motorbike() {
//    }
//
//    public Motorbike(String name, String model, String color, double volume) {
//        super(name, model, color);
//        this.volume = volume;
//    }

    @Override
    public String toString() {
        return "Motorbike {" + "volume=" + volume + " " + getName() + " " + getModel() + '}';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getWheelCount() {
        return wheelCount;
    }

}
