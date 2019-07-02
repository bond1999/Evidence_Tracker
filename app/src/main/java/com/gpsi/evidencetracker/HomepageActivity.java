package com.gpsi.evidencetracker;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class HomepageActivity extends AppCompatActivity {

    public static boolean loggedIn = false;
    public static int userId = 0;
    private static final int cameraRequestCode = 100;
    private static final int internetRequestCode = 200;
    private static final int coarseLocationRequestCode = 300;
    private static final int fineLocationRequestCode = 400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_homepage);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, cameraRequestCode);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET)
                == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.INTERNET}, internetRequestCode);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.ACCESS_COARSE_LOCATION}, coarseLocationRequestCode);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, fineLocationRequestCode);


        /**
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CAMERA},
                    YourRequestCode);
        }
*/
        final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean agreed = sharedPreferences.getBoolean("agreed",false);
        if(!agreed) {
            new AlertDialog.Builder(this)
                    .setTitle("License agreement")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putBoolean("agreed", true);
                            editor.commit();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setMessage("Limitation of use\n" +
                            "• By using our Services, you agree on behalf of yourself, your users and your attendees, not to:\n" +
                            "i. Modify prepare derivative works of, or reverse engineer, our Services without our prior written permission.\n" +
                            "ii. Knowing or negligently use our Services in a way that abuses or disrupts our networks, user accounts, databases or the Services without our prior written permission.\n" +
                            "iii. Transmit through the Services any material to any unauthorized person without permission.\n" +
                            "iv. Market or resell the services to any third party.\n" +
                            "v. Use the Services in violation of applicable laws or regulations.\n" +
                            "vi. Use the Services to send unauthorized advertising or spams.\n" +
                            "vii. Harvest, collect or gather user data without their consent.\n" +
                            "viii. Transmit through the Services any material that may infringe the Intellectual property, privacy or other rights of third parties.\n" +
                            "• Prohibit engaging in any activity that stops other users from enjoying the Services.\n" +
                            "\nProprietary Rights\n" +
                            "• You acknowledge that we or our licensors retain all proprietary right, title and interest in the Services, our name, logo or other marks (together, “The VIGILATTE MARKS”), and any related Intellectual Property rights, including without limitation, all modifications, enhancements, derivative works and upgrades there too.\n" +
                            "• You agree that you will not use or register any trademark, Service mark, business name, domain name or social media account name or handle which incorporates in whole or in part the VIGILATTE -The Evidence Collector or is like any of these.\n" +
                            "• You agree to comply with our Branding guidelines which are incorporated into this agreement by reference.\n" +
                            "\nUser Generated Content\n" +
                            "• Any user generated content submitted to our Service will fall under the Services right to improve inappropriate or illegal user generated data.\n" +
                            "\nContent\n" +
                            "• The services may contain information, links, text, graphics, photos, videos or other materials (“content”), including content with or submitted to the Services by you or through your account (“Your Content”). We take no responsibility for and do not expressly or implicitly endorse any of your content.\n" +
                            "• By submitting your content to the Services, you represent and warrant that you have all rights, power and authority necessary to post your content contained within these terms. Because you alone are responsible for your content, you may expose yourself to liability if you post or share content without all necessary rights.\n" +
                            "\nLimitation of Liabilities and Warrantees\n" +
                            "• You agree that vigilatte-the evidence collector shall in no event, be liable for any consequential, incidental, indirect, special, punitive, or other loss or damage whatsoever or for loss of work profits or salary, work interruption, computer failure or application failure or network failure, loss of information, or other loss arising out of or caused by your use of or inability to use the service, even if vigilatte-the evidence collector has been advised of the possibility of such damage\n" +
                            "• In no event shall vigilatte-the evidence collector’s entire liability to you in respect of any service, whether direct or indirect, exceed the fees paid by you towards such service.\n" +
                            "\nTermination and Suspension of Services\n" +
                            "• If you fail or VIGILATTE-The Evidence Collector or Higher officer or Government Suspects on reasonable grounds that you have failed, to comply with any of the provisions of this Agreement, VIGILATTE-The Evidence Collector or Higher officer or government may, without notice to you:\n" +
                            "i) Terminate this agreement and/or your VIGILATTE-The Evidence Collector ID, and you will remain liable;\n" +
                            "and/or\n" +
                            "ii) Terminate your license or authority to the software; and/or\n" +
                            "iii) Prelude your access to the Services.\n" +
                            "\nVIGILATTE-The Evidence Collector or Higher Officer or Government further reserves the right to modify, suspend or discontinue the services (or any part or content thereof) at any time with or without notice to you and to the full extent. Permitted by law, VIGILATTE-The Evidence Collector or Higher Officer or Government will not be liable to you or to any third party should it exercise such rights.\n" +
                            "• Termination will not affect the products or Services that you have already acquired. However, you may be unable to authorize additional computers or applications or networks to use such products or services.\n" +
                            "• You may cease to use the Services at any time.\n" +
                            "\nGoverning Law and Jurisdiction\n" +
                            "• These terms of Services are governed by the laws of Gurugram, India and all parties submit to the non-exclusive jurisdiction of the courts of this state or country.")
                    .show();
        }

        Button cases = (Button) findViewById(R.id.nav_cases);
        Button guidelines = (Button) findViewById(R.id.nav_guidelines);
        Button login = (Button) findViewById(R.id.nav_login);

        cases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                loginCheck();
                if(loggedIn==true)
                    startActivity(new Intent(HomepageActivity.this, CasesActivity.class));
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Please Login First!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
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
                loginCheck();
                if (loggedIn == false)
                    startActivity(new Intent(HomepageActivity.this, LoginActivity.class));
                else if(loggedIn == true) {
                    //                startActivity(new Intent(HomepageActivity.this, AccountActivity.class));
                }
            }
        });
    }

    private void loginCheck() {
        if(userId==0)
            loggedIn=false;
        else
            loggedIn=true;
    }
}