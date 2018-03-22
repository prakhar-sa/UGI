package com.example.smritisingh.ugi;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Smriti singh on 18-03-2018.
 */

public class login extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView = (TextView) findViewById(R.id.textView3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(login.this);
                dialog.setTitle("Change Password...");
                dialog.setContentView(R.layout.custom);
                final Button submit = (Button) dialog.findViewById(R.id.button6);
                final Button cancel = (Button) dialog.findViewById(R.id.button5);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        submit.isClickable();
                        if (submit.isPressed()) {
                            Toast.makeText(getBaseContext(), "Password changed succeessfully...", Toast.LENGTH_SHORT).show();
                        }


                        dialog.dismiss();
                    }
                });
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }
    }


