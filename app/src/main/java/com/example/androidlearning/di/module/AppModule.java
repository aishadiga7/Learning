package com.example.androidlearning.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.androidlearning.di.qualifier.AppContext;
import com.example.androidlearning.di.scopes.ForAppComponent;
import com.example.androidlearning.model.User;
import com.google.gson.Gson;

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

    @ForAppComponent
    @Provides
    public static User provideLoggedInUser() {
        return new User();
    }

    @ForAppComponent
    @Provides
    public static SharedPreferences provideSharedPref(@AppContext Context context) {
        return context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
    }
}
