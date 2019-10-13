package com.example.androidlearning;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Executor executor = Executors.newSingleThreadExecutor();


        for (int i = 1; i <= 12; i++) {
            final int name = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Log.d(TAG, "billing for" + name +"  in "+ Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.d(TAG, "Billing completed for "+ name);
                }
            });
        }

    }
}
