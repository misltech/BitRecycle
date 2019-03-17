package com.example.bitrecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;
public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView initSnapLogin = findViewById(R.id.snaplogin_logo);


        initSnapLogin.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {

                System.out.println("Started");
                //startActivity(new Intent(Login.this, MainActivity.class));
            }
        });


    }
}
