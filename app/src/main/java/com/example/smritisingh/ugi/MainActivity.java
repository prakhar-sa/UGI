package com.example.smritisingh.ugi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread splashThread = new Thread(){
         @Override
            public void run(){
                 super.run();
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException e){
                 e.printStackTrace();
             }finally {
                 finish();
                 startActivity(new Intent(MainActivity.this,MainApplication.class));
             }
         }
        };
        splashThread.start();
        }
}
