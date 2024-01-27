package com.example.insightlog.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.insightlog.R;

public class RegisterActivity extends AppCompatActivity {

    TextView haveAnAcTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        haveAnAcTv = findViewById(R.id.haveAnAcTv);

        haveAnAcTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGotoSignIn = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(iGotoSignIn);
            }
        });

    }
}