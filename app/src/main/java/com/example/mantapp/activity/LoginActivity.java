package com.example.mantapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mantapp.R;

public class LoginActivity extends AppCompatActivity {
    ImageButton login;
    EditText username, password;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        login = (ImageButton) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().toUpperCase().equals("12345678")){
                    login_sukses();
                } else {
                    Toast.makeText(getApplicationContext(), "Salah password !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent a = new Intent(this, MainActivity.class);

        a.putExtra("username", user_login);
        startActivity(a);
    }
}