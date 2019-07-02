package com.gpsi.evidencetracker;

import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AddCasesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private static int pic_id = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_add_cases);

//        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
//        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
//        mAdapter = new MyAdapter(myDataset);
//        recyclerView.setAdapter(mAdapter);

        Button add_picture = (Button) findViewById(R.id.add_picture);
        Button add_qr_code = (Button) findViewById(R.id.add_qr_code);
        Button submit_case = (Button) findViewById(R.id.nav_submit_case);


        add_picture.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent, pic_id++);
            }
        });

        add_qr_code.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });

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
                    CharSequence text = "Case Added Successfully!!";
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
