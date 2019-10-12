package com.example.androidlearning.di;

import android.content.Context;

@Module
public class ContextModule {


    private Context context;

    public ContextModule(Context context) {

        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }
}
