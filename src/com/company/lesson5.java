package com.company;

public class lesson5 {
    public static class Person {
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

    public static class PersonTest {
        public static void main(String[] args) {
            Person[] personArr = new Person[5];
            personArr[0] = new Person("Александр", "Инженер", "aleksandr@gmail.com", "89254396564", 60000, 30);
            personArr[1] = new Person("Иван", "Программист", "ivasha@gmail.com", "89365280797", 120000, 43);
            personArr[2] = new Person("Андрей", "Разработчик видеоигр", "andrusha@gmail.com", "89037862435", 50000, 32);
            personArr[3] = new Person("Евгений", "Аналитик программного обеспечения", "zhenya@hotmailcom", "84953594647", 60000, 41);
            personArr[4] = new Person("Владимир", "Тестировщик", "vladik@mail.ru", "86354495627", 55000, 35);
            for (Person person : personArr) {
                if (person.getAge() > 40) {
                   System.out.println(person);
                }
            }
        }
    }
}
