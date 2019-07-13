package com.example.androidlearning.usecase;

public class LoginPresenter {

    LoginUseCase loginUseCase;

    public LoginPresenter(LoginUseCase loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    public void login(){
        loginUseCase.login();
    }
}
