package com.example.androidlearning;

import android.app.Application;
import android.util.Log;

import com.example.androidlearning.di.ActivityComponent;
import com.example.androidlearning.di.AppComponent;
import com.example.androidlearning.di.AppComponent2;
import com.example.androidlearning.di.DaggerActivityComponent;
import com.example.androidlearning.di.DaggerAppComponent;
import com.example.androidlearning.di.DaggerAppComponent2;
import com.google.gson.Gson;

public class DaggerApplication extends Application {
    private static AppComponent appComponent;
    private static AppComponent2 appComponent2;
    private static ActivityComponent activityComponent;

    private static final String TAG = "DaggerApplication";
    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .setApplication(this)
                .setContext(this)
                .build();

        appComponent2 = DaggerAppComponent2.builder()
                .build();

        activityComponent = DaggerActivityComponent.builder().appComponent(appComponent).build();

        Gson gson1 = appComponent.gson();
        Gson gson2 = appComponent.gson();
        Gson gson3 = appComponent.gson();
        Gson gson4 = appComponent.gson();
        Log.d(TAG, "gson: "+ gson1);
        Log.d(TAG, "gson: "+ gson2);
        Log.d(TAG, "gson: "+ gson3);
        Log.d(TAG, "gson: "+ gson4);

   /*     Gson g1 = appComponent2.getgson();
        Gson g2 = appComponent2.getgson();
        Gson g3 = appComponent2.getgson();

        Log.d(TAG, "gson2: "+ g1);
        Log.d(TAG, "gson2: "+ g2);
        Log.d(TAG, "gson2: "+ g3);*/

        Gson gs1 = activityComponent.getGson();
        Gson gs2 = activityComponent.getGson();
        Gson gs3 = activityComponent.getGson();

        Log.d(TAG, "gson2: "+ gs1);
        Log.d(TAG, "gson2: "+ gs2);
        Log.d(TAG, "gson2: "+ gs3);


    }
}
