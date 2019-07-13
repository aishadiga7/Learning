package com.example.androidlearning;

import com.example.androidlearning.usecase.AESEncryption;
import com.example.androidlearning.usecase.Encryption;
import com.example.androidlearning.usecase.LoginPresenter;
import com.example.androidlearning.usecase.LoginUseCase;
import com.example.androidlearning.view.MainActivity;
import com.example.androidlearning.view.MainView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MainPresenterTest {


    MainPresenter mainPresenter;

    @Before
    public void setUp() throws Exception {
        mainPresenter = new MainPresenter(new MainView() {
            @Override
            public void displayText(String text) {

            }
        }, new Encryption() {
            @Override
            public String encrypt(String text) {
                return null;
            }

            @Override
            public String decrypt(String text) {
                return null;
            }
        });
    }

    @Test
    public void saveData() {

    }


    @Test
    public void encrypt() {
        String result = mainPresenter.encrypt("abc");
        assertEquals( "abc",result);
    }
}