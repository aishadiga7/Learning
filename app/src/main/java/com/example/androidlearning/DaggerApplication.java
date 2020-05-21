package com.example.androidlearning;

import android.app.Application;
import android.content.res.AssetManager;
import android.util.Log;

import com.example.androidlearning.di.AppComponent;
import com.example.androidlearning.di.DaggerAppComponent;
import com.google.gson.Gson;

public class DaggerApplication extends Application {
    public static AppComponent appComponent;

    private static final String TAG = "DaggerApplication";
    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .setApplication(this)
                .setContext(this)
                .setAssetManager(getAssets())
                .build();

    }
}
