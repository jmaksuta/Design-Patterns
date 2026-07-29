package com.maksuta.patterns.structural.adapter;

public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();

        System.out.println("Adapter operation status:");

        adapter.request();
    }

}
