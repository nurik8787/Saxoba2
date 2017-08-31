package com.example.user.saxoba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        setTitle("TabHost");

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost1); // ссылка на объект

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("tag1");

        tabSpec.setContent(R.id.linearLayout);
        tabSpec.setIndicator("Шайх Абу Аммор");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setContent(R.id.linearLayout2);
        tabSpec.setIndicator("Насир аль катами");
        tabHost.addTab(tabSpec);



        tabHost.setCurrentTab(1);

    }
}
