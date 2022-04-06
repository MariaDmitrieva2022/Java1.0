package com.company.lesson6;

public class Cat extends Animal {
    public Cat() {
        maxRunDistance = 200;
        name = "Кот";
    }
    public void swim(int distanceSwim) {
            System.out.println(name + " не умеет плавать.");
    }
}