package br.com.fiap.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static br.com.fiap.pizzaria.Constants.KEY_LOGIN;

public class MenuActivity extends AppCompatActivity {

    private TextView tvSaudacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvSaudacao = (TextView) findViewById(R.id.tvGreating);

        if (getIntent() != null) {
            tvSaudacao.setText(
                    getString(R.string.hello,
                    getIntent().getStringExtra(Constants.KEY_LOGIN)));
        }
    }
}
