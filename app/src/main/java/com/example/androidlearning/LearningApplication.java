package com.example.androidlearning;

import android.app.Application;

import com.example.androidlearning.di.AppComponent;
import com.example.androidlearning.di.ContextModule;
import com.example.androidlearning.di.DaggerAppComponent;
import com.example.androidlearning.di.MainModule;

public class LearningApplication extends Application {


    public static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .contextModule(new ContextModule(getApplicationContext())).build();

    }
}
