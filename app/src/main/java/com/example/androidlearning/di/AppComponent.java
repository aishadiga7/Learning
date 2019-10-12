package com.example.androidlearning.di;

import android.content.Context;

import com.example.androidlearning.FileManager;
import com.example.androidlearning.MainPresenter;
import com.example.androidlearning.usecase.Encryption;
import com.example.androidlearning.view.MainActivity;


@Component(modules = {MainModule.class, ContextModule.class})
public interface AppComponent {

    Encryption getEncryption();

   Context getApplicationContext();

   FileManager getFileManager();

   MainPresenter getMainPresenter();

   void inject(MainActivity mainActivity);

}

