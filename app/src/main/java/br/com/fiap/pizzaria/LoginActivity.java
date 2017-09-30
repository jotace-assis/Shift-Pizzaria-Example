package br.com.fiap.pizzaria;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static br.com.fiap.pizzaria.Constants.KEY_LOGIN;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout inputLogin;
    private TextInputLayout inputPassword;
    private TextView tvMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputLogin = (TextInputLayout) findViewById(R.id.inputLogin);
        inputPassword = (TextInputLayout) findViewById(R.id.inputPassword);
        tvMessage = (TextView) findViewById(R.id.outputMessage);
    }

    public void conectar(View v) {
        String login = inputLogin.getEditText().getText().toString();
        String password = inputPassword.getEditText().getText().toString();

        tvMessage.setVisibility(View.GONE);

        inputLogin.setError(getString(R.string.message_campo_obrigatorio));
        inputPassword.setError(getString(R.string.message_campo_obrigatorio));

        inputLogin.setErrorEnabled(login.trim().equals(""));
        inputPassword.setErrorEnabled(password.trim().equals(""));

        if (login.equals("android") && password.equals("123")) {
            // SUCESSO
            Intent telaMenu = new Intent(this, MenuActivity.class);
            telaMenu.putExtra(Constants.KEY_LOGIN, login);
            startActivity(telaMenu);
        }
        else {
            // FALHA
            tvMessage.setVisibility(View.VISIBLE);
            tvMessage.setText("Usuário ou senha inválidos");
        }

    }
}
