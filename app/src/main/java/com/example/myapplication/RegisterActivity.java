package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {


    EditText txtFirstName, txtLastName, txtUsername, txtPassword, txtRetypePassword;
    String firstName, lastName, userName, password, retypePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        txtRetypePassword = findViewById(R.id.txtRetypePassword);
    }

    public void onRegisterClicked(View v){
        firstName = txtFirstName.getText().toString();
        lastName = txtLastName.getText().toString();
        userName = txtUsername.getText().toString();
        password = txtPassword.getText().toString();
        retypePassword = txtRetypePassword.getText().toString();

        if(!password.equals(retypePassword)){
            Toast.makeText(this, "Your password and retype password doesn't match.", Toast.LENGTH_SHORT).show();
        }

        else {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("FullName", (firstName + " " + lastName));
            intent.putExtra("Username", userName);
            intent.putExtra("Password", password);
            Toast.makeText(this, "Register successfully", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }

    public void onCancelClicked(View v){
        txtFirstName.setText(null);
        txtLastName.setText(null);
        txtUsername.setText(null);
        txtPassword.setText(null);
        txtRetypePassword.setText(null);
        txtFirstName.requestFocus();
    }
}
