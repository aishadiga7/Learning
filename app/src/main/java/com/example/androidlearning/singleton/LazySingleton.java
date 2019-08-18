package com.example.androidlearning.singleton;

public class LazySingleton {

 public static LazySingleton lazySingleton;


    /**
     * Lazy ibit. object will be created within getInstance method,
     *
     * This approach is not thread safe, also every time if condiction has to be cheked
     * @return
     */

 public static LazySingleton getInstance(){

     if(lazySingleton == null)
         lazySingleton = new LazySingleton();
     return lazySingleton;
 }

    private LazySingleton() {
    }
}
