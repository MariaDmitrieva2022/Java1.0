package com.company.lesson;

public class Person {
    private String name;
    private String work;
    private String email;
    private String telefonnumber;
    private int salary;
    private int age;

    public Person(String _name, String _work, String _email, String _telefonnumber, int _salary, int _age) {
        name = _name;
        work = _work;
        email = _email;
        telefonnumber = _telefonnumber;
        salary = _salary;
        age = _age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", work='" + work + '\'' +
                ", email='" + email + '\'' +
                ", telefonnumber='" + telefonnumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

