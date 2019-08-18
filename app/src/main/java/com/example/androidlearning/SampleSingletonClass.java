package com.example.androidlearning;

public class SampleSingletonClass {
    private static SampleSingletonClass mInstance = null;
    public static final Object LOCK = new Object();//2000

    public static SampleSingletonClass getInstance() {

        if (mInstance != null) {
            return mInstance;
        }

       synchronized (LOCK) {
            if (mInstance == null) {
                mInstance = new SampleSingletonClass();
            }
       }
       return mInstance;
    }

    private SampleSingletonClass() {

    }


}
