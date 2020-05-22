package com.example.androidlearning.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.androidlearning.di.qualifier.AppContext;
import com.example.androidlearning.di.scopes.ForAppComponent;
import com.example.androidlearning.model.Name;
import com.google.gson.Gson;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class CommonUtility {
    private Gson gson;
    private Retrofit retrofit;
    private AssetManager assetManager;
    private Context activityContext;
    private Activity activity;
    private FragmentManager fragmentManager;
    private Application application;
    private Name name;
    private Router router;
    private ActivityUtility activityUtility;

    public CommonUtility(Gson gson, Retrofit retrofit, AssetManager assetManager, @AppContext Context activityContext, Activity activity, FragmentManager fragmentManager, Application application, Name name, Router router, ActivityUtility activityUtility) {
        this.gson = gson;
        this.retrofit = retrofit;
        this.assetManager = assetManager;
        this.activityContext = activityContext;
        this.activity = activity;
        this.fragmentManager = fragmentManager;
        this.application = application;
        this.name = name;
        this.router = router;
        this.activityUtility = activityUtility;
    }
}
