package com.example.androidlearning.di;

import android.content.Context;

import com.example.androidlearning.FileManager;
import com.example.androidlearning.MainPresenter;
import com.example.androidlearning.usecase.AESEncryption;
import com.example.androidlearning.usecase.Encryption;
import com.example.androidlearning.view.MainView;

public class ObjectFactory {
    Context context; // external depenmdecy
    Module module;


    public ObjectFactory(Context context) {
        context  = context;
    }
    public  MainPresenter getMainPresenter(){
        module = new Module();
        Context applicationContext =  module.provideContext() ;
        Encryption encryption = module.provideEncryptionObject();
        MainView mainView = module.provideMainView();
        return new MainPresenter(mainView, encryption);
    }


   class Module {
       public  MainPresenter provideMainPresenter(){
           Context applicationContext =  provideContext() ;
           Encryption encryption = provideEncryptionObject();
           MainView mainView = provideMainView();
           return new MainPresenter(mainView, encryption);
       }

       public Encryption provideEncryptionObject() {
           return new AESEncryption(provideContext());
       }

       public Context provideContext() {
           return context;
       }

       public MainView provideMainView() {
           return new MainView() {
               @Override
               public void displayText(String text) {

               }
           };
       }



       public FileManager provideFileManager() {
           return new FileManager(provideContext());
       }
   }

}
