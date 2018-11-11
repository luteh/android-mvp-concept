package com.luteh.mvploginexample.ui.login;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.luteh.mvploginexample.R;
import com.luteh.mvploginexample.model.LoginRequest;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter loginPresenter;

    @BindView(R.id.etLoginUsername)
    TextInputEditText etLoginUsername;
    @BindView(R.id.etLoginPassword)
    TextInputEditText etLoginPassword;
    @BindView(R.id.tilLoginUsername)
    TextInputLayout tilLoginUsername;
    @BindView(R.id.tilLoginPassword)
    TextInputLayout tilLoginPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenterImp(this);
    }

    @OnClick(R.id.btnSubmitLogin)
    protected void submitLogin() {
        if (loginPresenter.isValidLogin(etLoginUsername.getText(), etLoginPassword.getText())) {
            loginPresenter.submitLogin(new LoginRequest(etLoginUsername.getText().toString(), etLoginPassword.getText().toString()));
        }
    }

    @Override
    public void onLoginSuccess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUsernameError(String message) {
        tilLoginUsername.setError(message);
    }

    @Override
    public void onPasswordError(String message) {
        tilLoginPassword.setError(message);
    }

    @Override
    public void clearError() {
        tilLoginUsername.setError(null);
        tilLoginPassword.setError(null);
    }
}
