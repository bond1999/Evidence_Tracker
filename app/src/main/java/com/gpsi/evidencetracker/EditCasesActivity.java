package com.gpsi.evidencetracker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class EditCasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_edit_cases);

        Button go_back = (Button) findViewById(R.id.nav_go_back);
        go_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    Context context = getApplicationContext();
                    CharSequence text = "Case Edited Successfully!! \n (Yet to integrate with database)";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    finish();
            }
        });
    }
}
