package com.example.androidlearning.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.androidlearning.Constants;
import com.example.androidlearning.di.qualifier.AppContext;
import com.example.androidlearning.di.scopes.ForAppComponent;
import com.example.androidlearning.model.User;
import com.example.androidlearning.retrofit.ApiInterface;
import com.example.androidlearning.util.FileManager;
import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;
import example.IronBody;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {



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
    @ForAppComponent
    @Provides
    public static Retrofit getRetrofit(Gson gson) {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    @ForAppComponent
    @Provides
    public static ApiInterface provideApiInterface(Retrofit retrofit) {
        return retrofit.create(ApiInterface.class);
    }

    @ForAppComponent
    @Provides
    public static FileManager provideFileManager(Gson gson) {
        return new FileManager(gson);
    }

}
