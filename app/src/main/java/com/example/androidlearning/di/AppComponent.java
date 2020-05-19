package com.example.androidlearning.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.androidlearning.activities.HomeActivity;
import com.example.androidlearning.di.module.AppModule;
import com.example.androidlearning.di.module.GsonModule;
import com.example.androidlearning.di.qualifier.AppContext;
import com.example.androidlearning.di.scopes.ForAppComponent;
import com.example.androidlearning.model.User;
import com.example.androidlearning.retrofit.ApiInterface;
import com.google.gson.Gson;

import dagger.BindsInstance;
import dagger.Component;
import retrofit2.Retrofit;

@ForAppComponent
@Component(modules = {AppModule.class, GsonModule.class})
public interface AppComponent {
    HomeActivityComponent getActivityComponent();

    @Component.Builder
     interface Builder {
        AppComponent build();
        @BindsInstance
        Builder setApplication(Application  application);
        @BindsInstance
        Builder setContext(@AppContext Context  context);
    }
}
