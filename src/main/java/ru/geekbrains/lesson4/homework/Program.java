package ru.geekbrains.lesson4.homework;

public class Program {


    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println(orangeBox.getWeigth());
        System.out.println(orangeBox);

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        System.out.println(orangeBox1);

        orangeBox1.addAll(orangeBox);

        System.out.println(orangeBox);
        System.out.println(orangeBox1);

        orangeBox1.addAll(orangeBox);

        System.out.println(orangeBox1.compare(appleBox));

        System.out.println(orangeBox.compare(orangeBox1));
    }
}
