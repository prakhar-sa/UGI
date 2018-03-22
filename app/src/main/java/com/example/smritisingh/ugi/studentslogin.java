package com.example.smritisingh.ugi;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Smriti singh on 18-03-2018.
 */

public class studentslogin extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentslogin);
        LoginFragment loginFragment=new LoginFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment,loginFragment);
        fragmentTransaction.commit();
        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        RegisterFragment registerFragment = new RegisterFragment();
        FragmentManager fragmentManager1 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
        fragmentTransaction1.replace(R.id.fragment,registerFragment);
        fragmentTransaction1.commit();
        textView.setVisibility(View.INVISIBLE);
    }
}


