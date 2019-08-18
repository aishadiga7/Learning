package com.example.androidlearning.singleton;

public class ThreadSafeBlockSingleton {

    public static ThreadSafeBlockSingleton instance;
    public static Object MONITOR = new Object();

    private ThreadSafeBlockSingleton(){}


    /**
     * Thius approach is thread safe as well as it does not required entire getInstance method to be synchronized
     *
     * The issue is, still there is a need for if condition to be checked everytime, which will be true only for the first time
     * so perfomance will be affected
     * @return
     */

    public static ThreadSafeBlockSingleton getInstance(){

        if (instance !=null) {
            return instance;
        }

        synchronized (MONITOR) {
            if (instance == null) {
                instance = new ThreadSafeBlockSingleton();
            }
        }

        return instance;
    }

}
