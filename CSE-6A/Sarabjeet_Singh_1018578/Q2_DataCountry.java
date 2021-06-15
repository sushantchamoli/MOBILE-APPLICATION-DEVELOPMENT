package com.sarabjeet.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataCountry extends AppCompatActivity {
    ImageView img;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_country);
        img = findViewById(R.id.imageView);
        t1 = findViewById(R.id.textView1);
        t2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        int val = intent.getIntExtra("map",0);
        String title = intent.getStringExtra("title");
        String about = intent.getStringExtra("about");

        t1.setText(title);
        t2.setText(about);
        img.setImageResource(val);
    }
}