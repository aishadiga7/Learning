package com.example.androidlearning.di;

import android.content.Context;

import com.example.androidlearning.di.scopes.ForActivityComponent;
import com.google.gson.Gson;

import dagger.BindsInstance;
import dagger.Component;



@ForActivityComponent
@Component(dependencies = {AppComponent.class})
public interface HomeActivityComponent {
    Gson provideGson();

    @Component.Builder
    interface Builder {
        HomeActivityComponent build();

    }
}
