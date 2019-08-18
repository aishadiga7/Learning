package com.example.androidlearning.singleton;

public class ThreadSafeSingleton {
    public static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}


    /**
     * Thius approach is thread safe
     *
     * The issue is, entire getInstance method is synchronized, which is a costly operation to do evey time, on every access to getinstance
     *
     * so perfomance will be affected
     * @return
     */

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null)
            instance = new ThreadSafeSingleton();
        return instance;
    }

}
