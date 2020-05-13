package com.example.androidlearning.di;

import android.app.Application;
import android.content.Context;

import com.example.androidlearning.di.module.AppModule;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {

    @Component.Builder
     interface Builder {
        AppComponent build();
        @BindsInstance
        Builder setApplication(Application  application);
        @BindsInstance
        Builder setContext(Context  context);
    }
}
