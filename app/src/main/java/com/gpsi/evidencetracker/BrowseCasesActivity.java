package com.gpsi.evidencetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class BrowseCasesActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
    setContentView(R.layout.activity_browse_cases);

    Button case1 = (Button) findViewById(R.id.case1);
    Button case2 = (Button) findViewById(R.id.case2);
    Button case3 = (Button) findViewById(R.id.case3);

    case1.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        startActivity(new Intent(BrowseCasesActivity.this, Case1.class));
      }
    });

    case2.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        startActivity(new Intent(BrowseCasesActivity.this, Case2.class));
      }
    });

    case3.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        startActivity(new Intent(BrowseCasesActivity.this, Case3.class));
      }
    });

  }
}