package com.example.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apicall(new Callback() {
            @Override
            public void result(int x) {
                System.out.println(x);
            }
        });

        apicall((x) -> System.out.println(x));

    }



    public void apicall(Callback callback){
        // do something (API call) long running
        int x = 10;
        callback.result(x);
    }


    interface Callback{
        void result(int x);
    }



}
