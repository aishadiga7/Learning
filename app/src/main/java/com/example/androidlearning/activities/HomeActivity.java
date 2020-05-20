package com.example.androidlearning.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.androidlearning.DaggerApplication;
import com.example.androidlearning.R;
import com.example.androidlearning.di.AppComponent;
import com.example.androidlearning.di.HomeActivityComponent;
import com.example.androidlearning.di.qualifier.ActivityContext;
import com.example.androidlearning.di.qualifier.AppContext;
import com.example.androidlearning.model.Name;
import com.example.androidlearning.model.User;
import com.example.androidlearning.retrofit.ApiInterface;
import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.android.DaggerActivity;
import retrofit2.Retrofit;

public class HomeActivity extends AppCompatActivity {
    @Inject
    Gson gson;
    @Inject
    User user;
    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    ApiInterface apiInterface;
    @Inject
    Name name;

    private static final String TAG = "HomeActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        DaggerApplication.appComponent.getHomeActivtyComponentBuilder()
                .setContext(this)
                .setFragmentManager(getSupportFragmentManager())
                .build()
                .inject(this);


        Log.d(TAG, "gson : "+ gson);
        Log.d(TAG, "user: "+ user);
        Log.d(TAG, "sharedPref: "+ sharedPreferences);
        Log.d(TAG, "apiInterface: "+ apiInterface);
        Log.d(TAG, "name: "+ name.getName());
    }
}
