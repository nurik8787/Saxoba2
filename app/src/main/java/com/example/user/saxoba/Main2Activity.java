package com.example.user.saxoba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.lang.reflect.Array;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        setTitle("Saxoba");

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost1);
        ListView novqat = (ListView) findViewById(R.id.novqat);// ссылка на объект
        ListView yangi = (ListView) findViewById(R.id.yangi);
        final String [] Shayx = new String[] {
                "Ота ва Она","Зино"
        };
        final String [] Quran = new String[] {
        "Ал-Фатиха","Ал-Бакара","Ал-Имран","Ан-Ниса","Ал-Маида","Ал-Анаам"
        };

        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Shayx);

        novqat.setAdapter(Adapter);

        ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Quran);

        yangi.setAdapter(Adapter2);


        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("tag1");

        tabSpec.setContent(R.id.linearLayout);
        tabSpec.setIndicator("Шайх Абу Аммор");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setContent(R.id.linearLayout2);
        tabSpec.setIndicator("Насир аль катами");
        tabHost.addTab(tabSpec);



        tabHost.setCurrentTab(0);

    }
}
