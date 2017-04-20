package com.example.pedro.aboutme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact); //Recibe el layout

        TextView linkedin = (TextView) findViewById(R.id.linkedin);
        final TextView phone = (TextView) findViewById(R.id.phone);

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/"));
                startActivity(browse);
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_CALL, Uri.parse("tel: " + phone.getText().toString()));
                startActivity(call);
            }
        });

    }
}
