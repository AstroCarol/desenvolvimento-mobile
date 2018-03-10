package com.example.astrocarol.login;

import android.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editLogin;
    private EditText editSennha;
    private Button btnEnviar;

    View.OnClickListener btn = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String login = editLogin.getText().toString();
            String senha = editSennha.getText().toString();

            Dialog dialog = new Dialog();

            if (login == "user" && senha == "teste")
                dialog.show(getSupportFragmentManager(), "dialog");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        editLogin = (EditText) findViewById(R.id.editLogin);
        editSennha = (EditText) findViewById(R.id.editSenha);

        btnEnviar.setOnClickListener(btn);
    }
}
