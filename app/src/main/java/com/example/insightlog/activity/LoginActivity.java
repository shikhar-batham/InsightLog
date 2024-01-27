package com.example.insightlog.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.insightlog.FAQActivity;
import com.example.insightlog.R;
import com.example.insightlog.apiService.LoginService;
import com.example.insightlog.modelDto.LoginDto;
import com.example.insightlog.retrofit.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    TextView doNotHaveAc;

    EditText emailEdt, passwordEdt;

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        doNotHaveAc = findViewById(R.id.doNotHaveAc);
        emailEdt = findViewById(R.id.emailEdt);
        passwordEdt = findViewById(R.id.passwordEdt);
        btnLogin = findViewById(R.id.btnLogin);

        RetrofitService retrofitService = new RetrofitService();
        LoginService loginService = retrofitService.getRetrofit().create(LoginService.class);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = emailEdt.getText().toString();
                String password = passwordEdt.getText().toString();


                LoginDto loginDto = new LoginDto();
                loginDto.setEmail(email);
                loginDto.setPassword(password);

                loginService.createLogin(loginDto).enqueue(new Callback<LoginDto>() {
                    @Override
                    public void onResponse(Call<LoginDto> call, Response<LoginDto> response) {
                        Toast.makeText(LoginActivity.this, "Save successful!!", Toast.LENGTH_SHORT).show();

                        LoginDto receivedLoginDto = response.body();

                        Intent iNext = new Intent(LoginActivity.this, FAQActivity.class);
                        startActivity(iNext);
                    }

                    @Override
                    public void onFailure(Call<LoginDto> call, Throwable t) {
                        Toast.makeText(LoginActivity.this, " Unsuccessful!!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        doNotHaveAc.setOnClickListener(v -> {
            Intent iGotoSignUp = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(iGotoSignUp);
        });
    }
}