package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {
    private static void variables() {
        byte a = 10;
        int b = 100;
        float c = 12.01f;
        double d = 24.002d;
        boolean e = true;
        char f = 'R';
        String g = "Hello World!";
        System.out.println(
                "Byte: " + a + "\nInt: " + b + "\nFloat: " + c + "\nDouble: " + d +
                "\nBoolean: " + e + "\nChar: " + f + "\nString: " + g
        );
    }

    private static void conditions(int a) {
        if (a == 0) {
            System.out.println("Is Zero");
        } else if (a == 1) {
            System.out.println("Is One");
        } else {
            System.out.println("Is Unknown");
        }

        String b = a == 3 ? "Is Three" : "Is not Three";
        System.out.println(b);

        switch (a) {
            case 4:
                System.out.println("Is Four");
                break;
            case 5:
                System.out.println("Is Five");
                break;
            default:
                System.out.println("Is not Four or Five");
        }
    }

    private static void loops(int max) {
        int[] arr = new int[max];
        int[] arr2 = new int[] { 3, 2, 1 };
        for (int i = 0; i < max; i++) {
            arr[i] = i;
        }
        int j = 0;
        while (j < arr.length) {
            System.out.print(arr[j]);
            j++;
        }
        System.out.println();
        int k = 0;
        do {
            System.out.print(arr2[k]);
            k++;
        } while (k < arr2.length);
    }

    private static void classes() {
        Person sasha = new Person();
        sasha.setAge(25);
        System.out.println(sasha.getAge());

        Student misha = new Student(18, 5);
        misha.printInfo();
    }

    private static void abstractClass() {
        AbstractExample obj = new AbstractRealization();
        obj.ex();
    }

    private static void interfaceEx() {
        SayHello a = new SayHelloRealization();
        a.say();
    }

    private static void scanner() {
        Scanner str = new Scanner(System.in);
        System.out.println(str.nextLine());
    }

    public static void main(String[] args) {
//        variables();
//        scanner();
//        conditions(0);
//        loops(5);
//        classes();
//        abstractClass();
        interfaceEx();
    }
}
