package com.company;

public class Person {
    private int age = 0;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public Person() {}
    public Person(int age) {
        this.age = age;
    }
}
