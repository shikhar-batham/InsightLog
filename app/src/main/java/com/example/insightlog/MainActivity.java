package com.example.insightlog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.insightlog.activity.LoginActivity;
import com.example.insightlog.activity.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    Button btnGoToRegister, btnFaq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGoToLogin = findViewById(R.id.btnGoToLogin);
        btnGoToRegister = findViewById(R.id.btnGoToRegister);
        btnFaq = findViewById(R.id.btnFaq);

        btnGoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGoToLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(iGoToLogin);
            }
        });

        btnGoToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGoToRegister = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(iGoToRegister);
            }
        });

        btnFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iFaq = new Intent(getApplicationContext(), FAQActivity.class);
                startActivity(iFaq);
            }
        });
    }
}