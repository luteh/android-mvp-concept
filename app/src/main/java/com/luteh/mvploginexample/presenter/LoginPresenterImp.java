package com.luteh.mvploginexample.presenter;

import android.text.TextUtils;

import com.luteh.mvploginexample.model.LoginRequest;
import com.luteh.mvploginexample.view.ILoginView;

/**
 * Created by Luthfan Maftuh on 11/11/2018.
 * Email luthfanmaftuh@gmail.com
 */
public class LoginPresenterImp implements ILoginPresenter {
    /**
     * The login view
     **/
    private ILoginView ILoginView;

    /**
     * Create a new login presenter imp
     *
     * @param ILoginView the login view
     */
    public LoginPresenterImp(ILoginView ILoginView) {
        this.ILoginView = ILoginView;
    }

    @Override
    public void submitLogin(String email, String password) {
        ILoginView.clearError();
        LoginRequest loginRequest = new LoginRequest(email, password);

        switch (loginRequest.isValidLogin()) {
            case 0:
                ILoginView.onEmailError("Please enter an email");
                break;
            case 1:
                ILoginView.onPasswordError("Please enter an password");
                break;
            case 2:
                ILoginView.onEmailError("Email is invalid");
                break;
            case 3:
                ILoginView.onPasswordError("Password minimum length is 6");
                break;
            case -1:
                ILoginView.onLoginSuccess("Welcome " + loginRequest.getEmail());
                break;
        }
    }

    /*@Override
    public boolean isValidLogin(CharSequence username, CharSequence password) {
        ILoginView.clearError();
        if (TextUtils.isEmpty(username)) {
            ILoginView.onEmailError("Username is invalid!");
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            ILoginView.onPasswordError("Password is invalid!");
            return false;
        }
        return true;
    }*/
}
