package ru.javabegin.oop.model.details;

public class Engine {
    private double volume;

    public Engine(){

    }

    public Engine(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                '}';
    }
}
