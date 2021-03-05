package com.rku_18fotca11027.tutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername,edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
    }

    public void btnLoginClick(View view) {


        String valUsername = edtUsername.getText().toString();
        String valPassword = edtPassword.getText().toString();

        if (valUsername.equals( "admin@gmail.com") && valPassword.equals("123456")){
            Intent intent = new Intent(MainActivity.this,Welcome.class);
            startActivity(intent);
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            finish();
        }else{
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }


    }
}