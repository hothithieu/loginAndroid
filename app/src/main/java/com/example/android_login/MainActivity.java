package com.example.android_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   Button buttonLogin;
   EditText textEmail;
   EditText textPasswork;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = (Button) findViewById(R.id.button_login);
        textEmail=(EditText)findViewById(R.id.edit_text_email);
        textPasswork=(EditText)findViewById(R.id.edit_text_password);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=textEmail.getText().toString();
                String password=textPasswork.getText().toString();
                Intent intent = new Intent(MainActivity.this, activity_login.class);
                intent.putExtra("Email", userName);
                intent.putExtra("password", password);
                startActivity(intent);
            }
        });
    }
}
