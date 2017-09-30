package br.com.fiap.pizzaria;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout inputLogin;
    private TextInputLayout inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputLogin = (TextInputLayout) findViewById(R.id.inputLogin);
        inputPassword = (TextInputLayout) findViewById(R.id.inputPassword);
    }

    public void conectar(View v) {
        String login = inputLogin.getEditText().getText().toString();
        String password = inputPassword.getEditText().getText().toString();
    }
}
