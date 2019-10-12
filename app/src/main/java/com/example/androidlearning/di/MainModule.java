package com.example.androidlearning.di;

import android.content.Context;

import com.example.androidlearning.FileManager;
import com.example.androidlearning.MainPresenter;
import com.example.androidlearning.usecase.AESEncryption;
import com.example.androidlearning.usecase.Encryption;
import com.example.androidlearning.view.MainView;



@Module
public class MainModule {

    @Provides
    public Encryption provideEncryptionObject(Context context, FileManager fileManager) {
        return new AESEncryption(context, fileManager);
    }

    @Provides
    public FileManager provideFileManager(Context context) {
        return new FileManager(context);
    }

    @Provides
    public MainView provideMainView() {
        return new MainView() {
            @Override
            public void displayText(String text) {

            }
        };
    }

    @Provides
    public MainPresenter provideMainPresenter(MainView mainView, Encryption encryption){
        return new MainPresenter(mainView, encryption);
    }
}
