package com.company.lesson;

public class Cat extends Animal {
    public Cat() {
        MaxRunDistance = 200;
        MaxSwimDistance = 0;
        name = "Кот Барсик";
        Run(150);
        Swim(10);
        Cat cat = new Cat();
    }
}