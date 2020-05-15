package com.example.androidlearning;

import android.app.Application;
import android.util.Log;

import com.example.androidlearning.di.AppComponent;
import com.example.androidlearning.di.DaggerActivityComponent;
import com.example.androidlearning.di.DaggerAppComponent;
import com.example.androidlearning.di.DaggerAppComponent2;
import com.google.gson.Gson;

public class DaggerApplication extends Application {
    private static AppComponent appComponent;

    private static final String TAG = "DaggerApplication";
    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .setApplication(this)
                .setContext(this)
                .build();

    }
}
