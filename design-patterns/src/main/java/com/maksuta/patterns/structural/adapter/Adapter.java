package com.maksuta.patterns.structural.adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter() {
        super();
        this.adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.adaptedOperation();
    }

}
