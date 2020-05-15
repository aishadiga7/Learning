package com.example.androidlearning.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.androidlearning.DaggerApplication;
import com.example.androidlearning.R;
import com.example.androidlearning.di.DaggerHomeActivityComponent;
import com.example.androidlearning.di.HomeActivityComponent;
import com.google.gson.Gson;

import javax.inject.Inject;

public class HomeActivity extends AppCompatActivity {
    private static HomeActivityComponent activityComponent;
    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        activityComponent = DaggerHomeActivityComponent.builder().appComponent(DaggerApplication.appComponent).build();
        gson = activityComponent.provideGson();
    }
}
