package com.example.androidlearning.di.module;

import com.example.androidlearning.di.scopes.ForAppComponent;
import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;
import example.IronBody;

@Module
public class AppModule {

    @Provides
    public static Gson provideGson() {
        return new Gson();
    }

    @Provides
    public static IronBody provideIronBody(){
        return new IronBody(1);
    }
}
