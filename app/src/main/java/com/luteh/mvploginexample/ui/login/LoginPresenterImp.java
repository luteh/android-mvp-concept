package com.luteh.mvploginexample.ui.login;

import android.text.TextUtils;

import com.luteh.mvploginexample.model.LoginRequest;

/**
 * Created by Luthfan Maftuh on 11/11/2018.
 * Email luthfanmaftuh@gmail.com
 */
public class LoginPresenterImp implements LoginPresenter {
    /**
     * The login view
     **/
    private LoginView loginView;

    /**
     * Create a new login presenter imp
     *
     * @param loginView the login view
     */
    public LoginPresenterImp(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void submitLogin(LoginRequest loginRequest) {
        loginView.onLoginSuccess("Welcome " + loginRequest.getUsername());
    }

    @Override
    public boolean isValidLogin(CharSequence username, CharSequence password) {
        loginView.clearError();
        if (TextUtils.isEmpty(username)) {
            loginView.onUsernameError("Username is invalid!");
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            loginView.onPasswordError("Password is invalid!");
            return false;
        }
        return true;
    }
}
