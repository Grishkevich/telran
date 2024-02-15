package org.telran.hw_1;

public class Person {
    private String name, fullName;
    private int age;

    public Person() {
    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.printf("Такой-то %s идет\n", fullName);
    }

    public void talk() {
        System.out.printf("Такой-то %s говорит\n", fullName);
    }


}
