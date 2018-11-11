package com.luteh.mvploginexample.presenter;


/**
 * Created by Luthfan Maftuh on 11/11/2018.
 * Email luthfanmaftuh@gmail.com
 */
public interface ILoginPresenter {
    /**
     * Login
     *
     * @param email    the email
     * @param password the password
     */
    void submitLogin(String email, String password);
}
