package com.example.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiCall( () -> {}, (e, t) -> {});
    }



    private void apiCall(SuccessListener successListener, FailureListener failureListener) {

    }


    public interface SuccessListener {
        void onSuccess();
    }

    public interface FailureListener {
        void onFailure(Error error, Throwable throwable);
    }

}
