package com.company.lesson;

public class Animal {

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public void run(int distanceRun) {
        if (this.maxRunDistance > distanceRun) {
            System.out.println(name + " смог пробежать " + distanceRun + " метров.");
        } else {
            System.out.println(name + " не смог пробежать " + distanceRun + " метров и упал.");
        }
    }

    public void swim(int distanceSwim) {
        if (this.maxSwimDistance > distanceSwim) {
            System.out.println(name + " смог проплыть " + distanceSwim + " метров.");
        } else {
            System.out.println(name + " не смог проплыть " + distanceSwim + " метров и утонул.");
        }
    }

}
//Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//Добавить подсчет созданных котов, собак и животных.