package com.luteh.mvploginexample.ui.login;

import com.luteh.mvploginexample.model.LoginRequest;

/**
 * Created by Luthfan Maftuh on 11/11/2018.
 * Email luthfanmaftuh@gmail.com
 */
public interface LoginPresenter {
    /**
     * Login
     *
     * @param loginRequest the data model of Login form
     */
    void submitLogin(LoginRequest loginRequest);

    /**
     * validate the input fields of login form
     *
     * @param username the username
     * @param password the password
     **/
    boolean isValidLogin(CharSequence username, CharSequence password);
}
