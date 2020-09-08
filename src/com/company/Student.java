package com.company;

public class Student extends Person {
    private int mark = 0;

    public Student (int age, int mark) {
        super(age);
        this.mark = mark;
    }

    public void printInfo(){
        System.out.println("Student (" + super.getAge() + ") has mark " + this.mark);
    }
}
