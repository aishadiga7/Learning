package com.example.androidlearning.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.androidlearning.di.module.AppModule;
import com.example.androidlearning.di.qualifier.AppContext;
import com.example.androidlearning.di.scopes.ForAppComponent;
import com.example.androidlearning.model.User;
import com.google.gson.Gson;

import dagger.BindsInstance;
import dagger.Component;

@ForAppComponent
@Component(modules = {AppModule.class})
public interface AppComponent {

    Gson gson();
    User getUser();
    SharedPreferences getSharedPref();
    @AppContext
    Context getContext();

    @Component.Builder
     interface Builder {
        AppComponent build();
        @BindsInstance
        Builder setApplication(Application  application);
        @BindsInstance
        Builder setContext(@AppContext Context  context);
    }
}
