package com.company.lesson;

public class Dog extends Animal {
    public Dog() {
        MaxRunDistance = 500;
        MaxSwimDistance = 10;
        name = "Пёс Рыжик";
        Run(200);
        Swim(10);
        Dog dog = new Dog();
    }
}
