package com.example.androidlearning.usecase;

public interface LoginUseCase {

    User login();

    Error onError();
    class User{}
}


