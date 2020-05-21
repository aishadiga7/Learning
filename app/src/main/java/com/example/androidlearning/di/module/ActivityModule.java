package com.example.androidlearning.di.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.support.v4.app.FragmentManager;

import com.example.androidlearning.di.qualifier.AppContext;
import com.example.androidlearning.model.Name;
import com.example.androidlearning.retrofit.ApiInterface;
import com.example.androidlearning.util.ActivityUtility;
import com.example.androidlearning.util.Router;
import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    public static String provideNameString() {
        return "Aish";
    }

    @Provides
    public static Name provideName(String name) {
        return new Name(name);
    }

    @Provides
    public static ActivityUtility provideActivityUtility(FragmentManager fragmentManager, Gson gson, ApiInterface apiInterface) {
        return new ActivityUtility(fragmentManager, gson, apiInterface);
    }

    @Provides
    public static Router provideRouter(@AppContext Context applicationContext, Activity activity, FragmentManager fragmentManager, AssetManager assetManager) {
        return new Router(applicationContext, activity, fragmentManager, assetManager);
    }

}
