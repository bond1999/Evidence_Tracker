package com.gpsi.evidencetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class CasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cases);

        Button browse_cases = (Button) findViewById(R.id.nav_browse_cases);
        Button add_cases = (Button) findViewById(R.id.nav_add_case);
        Button edit_cases = (Button) findViewById(R.id.nav_edit_cases);

        browse_cases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CasesActivity.this, BrowseCasesActivity.class));
            }
        });

        add_cases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CasesActivity.this, AddCasesActivity.class));
            }
        });

        edit_cases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CasesActivity.this, EditCasesActivity.class));
            }
        });
    }
}
