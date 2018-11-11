package com.luteh.mvploginexample.model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;


/**
 * Created by Luthfan Maftuh on 11/11/2018.
 * Email luthfanmaftuh@gmail.com
 */
public class LoginRequest implements ILoginRequest {

    private String email;
    private String password;

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public int isValidLogin() {
        if (TextUtils.isEmpty(getEmail())) {
            return 0;
        } else if (TextUtils.isEmpty(getPassword())) {
            return 1;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) {
            return 2;
        } else if (getPassword().length() < 6) {
            return 3;
        } else return -1;
    }
}
