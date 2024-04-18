package ru.javabegin.oop.model.motorbike;

public class Kawasaki extends Motorbike{

    private int year;

    public Kawasaki(String name, String model, String color, double volume, int year) {
        super(name, model, color, volume);
        this.year = year;
    }

    public void jump(){
        System.out.println("Kawasaki jump");
    }

    @Override
    public String toString() {
        return "Motorbike {" + "volume=" + getVolume() + " " + getName() + " " + getModel() + " " + year + '}';
    }
}
