package com.example.user.saxoba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread imgTimer = new Thread() {

            public void run() {
                try {
                    int imgTimer = 0;

                    while (imgTimer < 5000) {
                        sleep(100);
                        imgTimer = imgTimer + 100;
                    };
                    Intent intent = new Intent(splashscreen.this, Main2Activity.class);
                    splashscreen.this.startActivity(intent);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }

            }

        };
        imgTimer.start();
    }
}
