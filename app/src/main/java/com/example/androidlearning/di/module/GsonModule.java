package com.example.androidlearning.di.module;

import com.example.androidlearning.di.scopes.ForAppComponent;
import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

@Module
public class GsonModule {

    @ForAppComponent
    @Provides
    public static Gson provideGson() {
        return new Gson();
    }
}
