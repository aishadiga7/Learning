package com.example.androidlearning.di.module;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public static Gson provideGson() {
        return new Gson();
    }
}
