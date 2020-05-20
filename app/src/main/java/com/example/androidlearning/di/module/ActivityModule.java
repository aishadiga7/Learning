package com.example.androidlearning.di.module;

import com.example.androidlearning.model.Name;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    public static String provideNameString() {
        return "Aish";
    }

    @Provides
    public static Name provideName(String name) {
        return new Name(name);
    }
}
