package com.gpsi.evidencetracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class GuidelinesActivity extends AppCompatActivity {



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
    setContentView(R.layout.activity_guidelines);

    Button guidelines1 = (Button) findViewById(R.id.nav_guidelines1);
    Button guidelines2 = (Button) findViewById(R.id.nav_guidelines2);
    Button guidelines3 = (Button) findViewById(R.id.nav_guidelines3);

    guidelines1.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        // Needs to Change
        Context context = getApplicationContext();
        CharSequence text = "(Yet to Implement)";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
      }
    });

    guidelines2.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        startActivity(new Intent(GuidelinesActivity.this, Guidelines2.class));

      }
    });

    guidelines3.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        // Needs to Change
        Context context = getApplicationContext();
        CharSequence text = "(Yet to Implement)";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
      }
    });

  }
}