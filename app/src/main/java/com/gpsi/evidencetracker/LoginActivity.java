package com.gpsi.evidencetracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.nav_submit_login);

        login.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if(emptyVal()==true){
                    Context context = getApplicationContext();
                    CharSequence text = "Field(s) left Blank!! Please Enter your Login Details.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Logged In Successfully!! \n (Yet to integrate with Database)";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    finish();
                }
            }
        });
    }

    private boolean emptyVal() {

        EditText name = (EditText) findViewById(R.id.textbox_name);
        EditText badgeno = (EditText) findViewById(R.id.textbox_badgeno);
        EditText dob = (EditText) findViewById(R.id.textbox_dob);
        EditText password = (EditText) findViewById(R.id.textbox_password);

        String name_text = name.getText().toString().trim();
        String badgeno_text = badgeno.getText().toString().trim();
        String dob_text = dob.getText().toString().trim();
        String password_text = password.getText().toString().trim();

        if(name_text.isEmpty() || name_text.length() == 0 || name_text.equals("") || name_text == null ||
            badgeno_text.isEmpty() || badgeno_text.length() == 0 || badgeno_text.equals("") || badgeno_text == null ||
            dob_text.isEmpty() || dob_text.length() == 0 || dob_text.equals("") || dob_text == null ||
            password_text.isEmpty() || password_text.length() == 0 || password_text.equals("") || password_text == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
