package ru.javabegin.oop.model.motorbike;

public class Kawasaki extends Motorbike{

//    private int year;

    public Kawasaki(String name, String model, String color, int wheelCount) {
        super(name, model, color, wheelCount);
    }


    public void jump(){
        System.out.println("Kawasaki jump");
    }

    @Override
    public String toString() {
        return "Kawasski {" + "volume=" + getVolume() + " " + getName() + " " + getModel() + " " + getWheelCount() + '}';
    }
}
