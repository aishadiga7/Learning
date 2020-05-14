package com.example.androidlearning.di;

import com.example.androidlearning.di.module.AppModule;
import com.google.gson.Gson;

import dagger.Component;
import dagger.Module;
import example.IronBody;

@Component(modules = AppModule.class)
public interface ActivityComponent {

    IronBody getBody();


}
