package com.maksuta.patterns.creational.singleton;

public class SingletonThreadSafe {

    private volatile static SingletonThreadSafe instance;

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                instance = new SingletonThreadSafe();
            }
        }
        return instance;
    }

    private SingletonThreadSafe() {
        super();
    }

}
