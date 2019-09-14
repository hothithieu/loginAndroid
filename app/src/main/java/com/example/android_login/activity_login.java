package com.example.android_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {
   Button buttonBack;
    private TextView textemail;
    private TextView TextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonBack=(Button) findViewById(R.id.btnnBack);
        textemail = (TextView)findViewById(R.id.email);
        TextPassword = (TextView)findViewById(R.id.password);

        Intent intent= getIntent();
        Bundle getemai = intent.getExtras();
        Bundle getpassword = intent.getExtras();

        if(getemai!=null || getpassword!=null)
        {
            String j =(String) getemai.get("Email");
            textemail.setText(j);
            String P =(String) getpassword.get("password");
            TextPassword.setText(P);
        }

//        if(getpassword!=null)
//        {
//            String P =(String) getpassword.get("password");
//            textemail.setText(P);
//        }
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_login.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
