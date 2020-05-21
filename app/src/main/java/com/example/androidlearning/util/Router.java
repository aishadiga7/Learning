package com.example.androidlearning.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.support.v4.app.FragmentManager;

public class Router {
    Context applicationContext;
    Activity activity;
    FragmentManager fragmentManager;
    AssetManager assetManager;

    public Router(Context applicationContext, Activity activity, FragmentManager fragmentManager, AssetManager assetManager) {
        this.applicationContext = applicationContext;
        this.activity = activity;
        this.fragmentManager = fragmentManager;
        this.assetManager = assetManager;
    }
}
