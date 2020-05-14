package com.example.androidlearning.di;

import com.example.androidlearning.di.module.AppModule;
import com.google.gson.Gson;

import dagger.Component;

@ForAppComponent
@Component(modules = {AppModule.class})
public interface AppComponent2 {
    Gson getgson();

}
