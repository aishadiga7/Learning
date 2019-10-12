package com.example.androidlearning.view;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidlearning.FileManager;
import com.example.androidlearning.LearningApplication;
import com.example.androidlearning.MainPresenter;
import com.example.androidlearning.R;
import com.example.androidlearning.usecase.Encryption;



public class MainActivity extends AppCompatActivity implements MainView{
    private EditText mEditText;
    private MainPresenter mMainPresenter;
     @Inject
     Encryption encryption;
     @Inject
     Context context;
     @Inject
     FileManager fileManager;
     @Inject
     MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LearningApplication.appComponent.inject(this);




        String aishwarya = encryption.encrypt("Aishwarya");
        Log.d("DAGGER", "onCreate: Encrypted string is "+aishwarya);
/*
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        mEditText = findViewById(R.id.editext);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mMainPresenter.encrypt("Aishwarya");
            }
        });


        Log.d("DAGGER", " Encrytion object = "+ encryption);
        Log.d("DAGGER", " Context object = "+ context);
        Log.d("DAGGER", " FileManager object = "+ fileManager);
        Log.d("DAGGER", " Presenter object = "+ mainPresenter);*/

    }


    @Override
    public void displayText(String text) {
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
    }
}
