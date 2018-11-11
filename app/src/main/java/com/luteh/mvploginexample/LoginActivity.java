package com.luteh.mvploginexample;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.luteh.mvploginexample.presenter.ILoginPresenter;
import com.luteh.mvploginexample.presenter.LoginPresenterImp;
import com.luteh.mvploginexample.view.ILoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    private ILoginPresenter ILoginPresenter;

    @BindView(R.id.etLoginEmail)
    TextInputEditText etLoginEmail;
    @BindView(R.id.etLoginPassword)
    TextInputEditText etLoginPassword;
    @BindView(R.id.tilLoginEmail)
    TextInputLayout tilLoginEmail;
    @BindView(R.id.tilLoginPassword)
    TextInputLayout tilLoginPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        ILoginPresenter = new LoginPresenterImp(this);
    }

    @OnClick(R.id.btnSubmitLogin)
    protected void submitLogin() {
        ILoginPresenter.submitLogin(etLoginEmail.getText().toString(), etLoginPassword.getText().toString());
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
    public void onEmailError(String message) {
        tilLoginEmail.setError(message);
    }

    @Override
    public void onPasswordError(String message) {
        tilLoginPassword.setError(message);
    }

    @Override
    public void clearError() {
        tilLoginEmail.setError(null);
        tilLoginPassword.setError(null);
    }
}
