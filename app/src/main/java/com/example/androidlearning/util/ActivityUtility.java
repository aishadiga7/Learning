package com.example.androidlearning.util;

import android.support.v4.app.FragmentManager;

import com.example.androidlearning.retrofit.ApiInterface;
import com.google.gson.Gson;

public class ActivityUtility {
    private FragmentManager fragmentManager;
    private Gson gson;
    private ApiInterface apiInterface;

    public ActivityUtility(FragmentManager fragmentManager, Gson gson, ApiInterface apiInterface) {
        this.fragmentManager = fragmentManager;
        this.gson = gson;
        this.apiInterface = apiInterface;
    }
}
