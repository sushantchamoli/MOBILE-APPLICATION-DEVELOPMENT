package com.priyanshBinjola.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataCountry extends AppCompatActivity {
    ImageView img;
    TextView tt1,tt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_country);
        img = findViewById(R.id.imageView);
        tt1 = findViewById(R.id.textView1);
        tt2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        int val = intent.getIntExtra("map",0);
        String title = intent.getStringExtra("title");
        String about = intent.getStringExtra("about");

        tt1.setText(title);
        tt2.setText(about);
        img.setImageResource(val);
    }
}