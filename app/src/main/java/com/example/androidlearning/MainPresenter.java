package com.example.androidlearning;

import com.example.androidlearning.usecase.AESEncryption;
import com.example.androidlearning.usecase.Encryption;
import com.example.androidlearning.view.MainActivity;
import com.example.androidlearning.view.MainView;

public class MainPresenter {

    private MainView mainView;
    private Encryption encryption;


    public MainPresenter(MainView mainView, Encryption encryption) {
        this.mainView = mainView;
        this.encryption = encryption;
    }



    public void saveData(String encryptedString) {
        System.out.println(encryptedString);
    }

    public String encrypt(String text) {
        String encrypt = encryption.encrypt(text);
        mainView.displayText(text);
        return encrypt;
    }






}
