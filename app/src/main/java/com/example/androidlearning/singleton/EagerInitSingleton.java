package com.example.androidlearning.singleton;

class EagerInitSingleton {
    private static final EagerInitSingleton ourInstance = new EagerInitSingleton();// eager, as well as thread safe

    /**
     * lazy init
     *
     * here object is
     * @return
     */

    public static EagerInitSingleton getInstance() {
        return ourInstance;
    }

    private EagerInitSingleton() {
    }
}
