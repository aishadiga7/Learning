package com.example.androidlearning.di;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.FragmentManager;

import com.example.androidlearning.di.scopes.ForActivityComponent;
import com.google.gson.Gson;

import dagger.BindsInstance;
import dagger.Component;



@ForActivityComponent
@Component(dependencies = {AppComponent.class})
public interface HomeActivityComponent {
    Gson provideGson();

    FragmentManager provideFragmentManager();

    @Component.Builder
    interface Builder {
        HomeActivityComponent build();
        @BindsInstance
        HomeActivityComponent.Builder setFragmentManager(FragmentManager fragmentManager);

        Builder setAppComponent(AppComponent appComponent);
    }
}
