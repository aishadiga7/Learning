package com.example.androidlearning.singleton;

public class SingletonWithHolerClass {

    private String mMyString = "Hello";

    private SingletonWithHolerClass() {

    }

    public static SingletonWithHolerClass getInstance() {
        return Holder.getInstance();

    }

    private static class Holder {

        private static SingletonWithHolerClass instance = new SingletonWithHolerClass();

        public static SingletonWithHolerClass getInstance() {
            return instance;
        }
    }


}
