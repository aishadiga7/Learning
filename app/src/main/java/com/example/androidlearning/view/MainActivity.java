package com.example.androidlearning.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidlearning.MainPresenter;
import com.example.androidlearning.R;
import com.example.androidlearning.RSAEncrypition;
import com.example.androidlearning.usecase.AESEncryption;

public class MainActivity extends AppCompatActivity implements MainView{
    private EditText mEditText;
    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        mEditText = findViewById(R.id.editext);
        mMainPresenter = new MainPresenter(this, new AESEncryption(getApplicationContext()));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mMainPresenter.encrypt("Aishwarya");
            }
        });
    }


    @Override
    public void displayText(String text) {
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
    }
}
