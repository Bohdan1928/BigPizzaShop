package com.example.bigpizzashop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class LogoActivity extends AppCompatActivity {
    private ImageView logo;
    private TextView nameOfLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        logo = findViewById(R.id.logo);
        nameOfLogo = findViewById(R.id.nameOfLogo);

        nameOfLogo.animate().alpha(1).setDuration(3000);
        logo.animate().rotation(3600).alpha(1).setDuration(2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LogoActivity.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        }, 3000);
    }
}