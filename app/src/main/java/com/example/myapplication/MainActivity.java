package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtFullName, txtUsername, txtPassword;
    String fullName, userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFullName = findViewById(R.id.txtFullName);
        txtUsername = findViewById(R.id.txtUsernameMain);
        txtPassword = findViewById(R.id.txtPasswordMain);

        fullName = getIntent().getExtras().getString("FullName").toString();
        userName = getIntent().getExtras().getString("Username").toString();
        password = getIntent().getExtras().getString("Password").toString();

        txtFullName.setText(fullName);
        txtUsername.setText(userName);
        txtPassword.setText(password);
    }
}
