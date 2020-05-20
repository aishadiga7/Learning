package com.example.androidlearning.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;

import com.example.androidlearning.activities.HomeActivity;
import com.example.androidlearning.di.module.ActivityModule;
import com.example.androidlearning.di.qualifier.ActivityContext;
import com.example.androidlearning.di.scopes.ForActivityComponent;
import com.example.androidlearning.model.User;
import com.google.gson.Gson;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;


@Subcomponent(modules = {ActivityModule.class})
public interface HomeActivityComponent {
    void inject(HomeActivity homeActivity);

}
