package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public float getWeigth(){
        if (fruits.size() != 0){
            return fruits.get(0).getWeight() * fruits.size();
        }
        return 0;
    }

    public void add(T fruct){
        fruits.add(fruct);
    }

    public boolean compare(Box e){
        return e.getWeigth() == getWeigth();
    }

    public void clear(){
        fruits.clear();
    }

    public void addAll(Box<T> e){
        if (fruits.size() != 0){
            Fruit fruct = e.getName().equals("Апельсин")? (new Orange()):(new Apple());
            for (int i = 0; i < fruits.size();i++){
                e.add((T) fruct);
            }
            fruits.clear();
        } else {
            System.out.println("Нельзя произвести операцию так, как коробка пуста!");
        }
    }

    @Override
    public String toString() {
        return String.format("Вес коробки составляет: %.1f",getWeigth());
    }

    public String getName(){
        if (fruits.size() != 0){
            return fruits.get(0).getName();
        }
        return "Пустая коробка";
    }
}
