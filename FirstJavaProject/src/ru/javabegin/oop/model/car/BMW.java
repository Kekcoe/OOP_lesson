package ru.javabegin.oop.model.car;

public class BMW extends Car{

    public BMW(String name, String model, String color) {
        super(name, model, color);
    }

    public BMW(){
        System.out.println("bmw constructor");
    }

    @Override
    public void drive() {
        super.signal();
        super.drive();
        System.out.println("drive BMW");
    }
}
