package com.example.androidlearning.di;

import android.app.Application;
import android.content.Context;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {})
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
