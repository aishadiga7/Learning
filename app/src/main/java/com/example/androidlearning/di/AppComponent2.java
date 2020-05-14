package com.example.androidlearning.di;

import com.example.androidlearning.di.module.AppModule;
import com.example.androidlearning.di.scopes.ForAppComponent;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;


@Component(modules = AppModule.class)
public interface AppComponent2 {
   //Gson getgson();

}
