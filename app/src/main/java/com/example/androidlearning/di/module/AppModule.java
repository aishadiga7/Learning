package com.example.androidlearning.di.module;

import com.example.androidlearning.di.ForAppComponent;
import com.google.gson.Gson;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import example.IronBody;

@Module
public class AppModule {

    @ForAppComponent
    @Provides
    public static Gson provideGson() {
        return new Gson();
    }

    @Provides
    public static IronBody provideIronBody(){
        return new IronBody(1);
    }
}
