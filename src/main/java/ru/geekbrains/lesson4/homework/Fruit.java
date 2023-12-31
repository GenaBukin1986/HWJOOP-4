package ru.geekbrains.lesson4.homework;

public abstract class Fruit {

    private final float weight;

    private final String name;

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Fruit(float weight,String name) {
        this.weight = weight;
        this.name = name;
    }
}
