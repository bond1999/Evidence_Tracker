package com.gpsi.evidencetracker;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CameraActivity extends AppCompatActivity {



    private static int pic_id = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_guidelines);

        Button recapture_image = (Button) findViewById(R.id.recapture_image);
        ImageView click_image_id = (ImageView)findViewById(R.id.display_pic);

        recapture_image.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                android.content.Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent, pic_id);
       //         onActivityResult(pic_id,);
            }
        });
/**
        protected void onActivityResult(int requestCode, int resultCode, Intent data)
        {

            // Match the request 'pic id with requestCode
            if (requestCode == pic_id) {

                // BitMap is data structure of image file
                // which stor the image in memory
                Bitmap photo = (Bitmap)data.getExtras()
                        .get("data");

                // Set the image in imageview for display
                click_image_id.setImageBitmap(photo);
            }
        }
 */
    }
}