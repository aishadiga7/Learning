package com.example.androidlearning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiCall((x)-> System.out.println("Success"), (y) -> System.out.println("Error"), ()-> System.out.println("Complete"));



        apiCall(new SuccessListener() {
            @Override
            public void onSuccess(Result result) {
                System.out.println("Success");
            }
        }, new FailureListener() {
            @Override
            public void onError(Error error) {

            }
        }, new CompleteListener() {
            @Override
            public void onComplete() {

            }
        });

    }



    public void apiCall(SuccessListener success, FailureListener failure, CompleteListener complete){

        if(true){
            success.onSuccess(new SuccessListener.Result());
        }else {
            failure.onError(new Error());
        }
        complete.onComplete();
    }


}
