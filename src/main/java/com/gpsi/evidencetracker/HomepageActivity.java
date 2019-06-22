package com.gpsi.evidencetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_homepage);

        Button cases = (Button) findViewById(R.id.nav_cases);
        Button guidelines = (Button) findViewById(R.id.nav_guidelines);
        Button login = (Button) findViewById(R.id.nav_login);

        cases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomepageActivity.this, CasesActivity.class));
            }
        });

        guidelines.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomepageActivity.this, GuidelinesActivity.class));
            }
        });

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomepageActivity.this, LoginActivity.class));
            }
        });
    }
}