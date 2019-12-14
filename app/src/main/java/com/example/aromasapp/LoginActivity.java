package com.example.aromasapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import  com.example.aromasapp.models.Users;
public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText txtUser;
    EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnLogin);
        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Users.passwordIsValis(txtUser.getText().toString(), txtPassword.getText().toString())){
                    Intent o = new Intent(LoginActivity.this, InicioActivity.class);
                    startActivity(o);
                }
            }
        });
    }
}