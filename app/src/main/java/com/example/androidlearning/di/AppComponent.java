package com.example.androidlearning.di;

import android.app.Application;
import android.content.Context;

import com.example.androidlearning.di.module.AppModule;
import com.google.gson.Gson;

import dagger.BindsInstance;
import dagger.Component;
import example.Car;

@ForAppComponent
@Component(modules = {AppModule.class})
public interface AppComponent {

    Gson gson();








    @Component.Builder
     interface Builder {
        AppComponent build();
        @BindsInstance
        Builder setApplication(Application  application);
        @BindsInstance
        Builder setContext(Context  context);
    }
}
