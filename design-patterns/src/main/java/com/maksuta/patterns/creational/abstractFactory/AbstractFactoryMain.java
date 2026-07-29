package com.maksuta.patterns.creational.abstractFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        ConcreteFactory2 factory2 = new ConcreteFactory2();

        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();

        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();

        System.out.printf("Factory 1 created %s and %s.\n", productA1, productB1);
        System.out.printf("Factory 2 created %s and %s.\n", productA2, productB2);
    }

}