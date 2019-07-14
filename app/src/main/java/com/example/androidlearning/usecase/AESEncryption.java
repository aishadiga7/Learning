package com.example.androidlearning.usecase;

import android.content.Context;

import com.example.androidlearning.FileManager;
import com.example.androidlearning.MainPresenter;

import java.util.Base64;

public class AESEncryption implements Encryption {



    public AESEncryption(Context context, FileManager fileManager) {
    }

    @Override
    public String encrypt(String text) {
        // do encrytion logic here
        return "00000";
    }

    @Override
    public String decrypt(String text) {
        //do decryption logic here
        return text;
    }
}
