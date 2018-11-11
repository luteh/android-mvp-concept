package com.luteh.mvploginexample.view;

/**
 * Created by Luthfan Maftuh on 11/11/2018.
 * Email luthfanmaftuh@gmail.com
 */
public interface ILoginView {
    /**
     * Login success
     **/
    void onLoginSuccess(String message);

    /**
     * Show the login error toast message
     */
    void onLoginError(String message);

    /**
     * Show the username error message
     *
     * @param message the error message
     */
    void onEmailError(String message);

    /**
     * Show the password error message
     *
     * @param message the error message
     */
    void onPasswordError(String message);

    /**
     * Clear the error effect on all fields
     **/
    void clearError();
}
