package com.example.androidlearning.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.androidlearning.DaggerApplication;
import com.example.androidlearning.R;
import com.example.androidlearning.di.DaggerHomeActivityComponent;
import com.example.androidlearning.di.HomeActivityComponent;
import com.example.androidlearning.model.User;
import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class HomeActivity extends AppCompatActivity {
    private static HomeActivityComponent activityComponent;
    private Gson gson;
    private FragmentManager fragmentManager;
    private Context context;
    private User user;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        activityComponent = DaggerHomeActivityComponent.builder()
                .setFragmentManager(getSupportFragmentManager())
                .setAppComponent(DaggerApplication.appComponent)
                .setContext(this)
                .build();

        gson = activityComponent.provideGson();
        fragmentManager = activityComponent.provideFragmentManager();
        context = activityComponent.provideContext();
        user = activityComponent.provideUser();
        sharedPreferences = activityComponent.provideSharedPreference();

        
    }
}
