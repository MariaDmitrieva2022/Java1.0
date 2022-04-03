package com.company.lesson;

public class Animal {
    String name;
    int MaxRunDistance;
    int MaxSwimDistance;
    protected int distanceRun;
    protected int distanceSwim;

    public void main(String[] args) {
        Condition();
    }

    public void Run(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public void Swim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }

    public void Condition() {
        if (distanceRun > MaxRunDistance) {
            System.out.println(name + " пробежал " + MaxRunDistance + " и упал.");
        } else {
            System.out.println(name + " пробежал " + distanceRun);
        }
        if (distanceSwim > MaxSwimDistance) {
            System.out.println(name + " проплыл " + MaxSwimDistance + " и утонул");
        } else {
            System.out.println("Кот проплыл " + distanceSwim);
            System.out.println("Кот проплыл " + distanceSwim);
            System.out.println("Кот проплыл " + distanceSwim);
        }
    }
}
//Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//Добавить подсчет созданных котов, собак и животных.