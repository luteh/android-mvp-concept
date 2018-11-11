package com.luteh.mvploginexample.model;

/**
 * Created by Luthfan Maftuh on 11/11/2018.
 * Email luthfanmaftuh@gmail.com
 */
public interface ILoginRequest {
    String getEmail();

    String getPassword();

    /**
     * validate the input fields of login form
     */
    int isValidLogin();

}
