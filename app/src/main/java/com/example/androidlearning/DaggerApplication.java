package com.example.androidlearning;

import android.app.Application;

import com.example.androidlearning.di.AppComponent;
import com.example.androidlearning.di.DaggerAppComponent;

public class DaggerApplication extends Application {
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .setApplication(this)
                .setContext(this)
                .build();
    }
}
