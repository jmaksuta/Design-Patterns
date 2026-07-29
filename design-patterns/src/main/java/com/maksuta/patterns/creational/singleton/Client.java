package com.maksuta.patterns.creational.singleton;

public class Client {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        System.out.printf("Singleton 1 hashcode: %d, Singleton 2 hashcode: %d\nBoth instances are equal is %s.\n",
                singleton1.hashCode(), singleton2.hashCode(), String.valueOf(singleton1 == singleton2));

    }

}
