package com.luteh.mvploginexample.ui.login;

/**
 * Created by Luthfan Maftuh on 11/11/2018.
 * Email luthfanmaftuh@gmail.com
 */
public interface LoginView {
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
    void onUsernameError(String message);

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
