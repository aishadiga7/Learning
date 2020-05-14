package com.example.androidlearning.di;

import com.example.androidlearning.di.module.AppModule;
import com.example.androidlearning.di.scopes.ForActivityComponent;
import com.google.gson.Gson;

import dagger.Component;
import dagger.Module;
import example.IronBody;

@ForActivityComponent
@Component(dependencies = {AppComponent.class, AppComponent2.class})
public interface ActivityComponent {

        Gson getGson();


}
