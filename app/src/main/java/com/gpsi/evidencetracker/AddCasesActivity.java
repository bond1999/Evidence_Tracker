package com.gpsi.evidencetracker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddCasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_add_cases);

        Button submit_case = (Button) findViewById(R.id.nav_submit_case);
        submit_case.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(emptyVal()==true){
                    Context context = getApplicationContext();
                    CharSequence text = "Field(s) left Blank!! Please Enter Case Details.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Case Added Successfully!! \n (Yet to integrate with database)";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    finish();
                }
            }
        });

    }
    private boolean emptyVal() {

        EditText caseno = (EditText) findViewById(R.id.textbox_caseno);
        EditText category = (EditText) findViewById(R.id.textbox_category);
        EditText doi = (EditText) findViewById(R.id.textbox_doi);
        EditText noio = (EditText) findViewById(R.id.textbox_noio);
        EditText branch = (EditText) findViewById(R.id.textbox_branch);


        String caseno_text = caseno.getText().toString().trim();
        String category_text = category.getText().toString().trim();
        String doi_text = doi.getText().toString().trim();
        String noio_text = noio.getText().toString().trim();
        String branch_text = branch.getText().toString().trim();

        if(caseno_text.isEmpty() || caseno_text.length() == 0 || caseno_text.equals("") || caseno_text == null ||
                category_text.isEmpty() || category_text.length() == 0 || category_text.equals("") || category_text == null ||
                doi_text.isEmpty() || doi_text.length() == 0 || doi_text.equals("") || doi_text == null ||
                noio_text.isEmpty() || noio_text.length() == 0 || noio_text.equals("") || noio_text == null ||
                branch_text.isEmpty() || branch_text.length() == 0 || branch_text.equals("") || branch_text == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
