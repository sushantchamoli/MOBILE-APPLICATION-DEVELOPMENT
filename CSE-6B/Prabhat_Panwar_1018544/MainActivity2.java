package com.example.Q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;			//prahbat singh panwar
import android.widget.TextView;			//roll no. 1018544_39

public class MainActivity2 extends AppCompatActivity {
    TextView cs1 ,cs2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cs1 = findViewById(R.id.textView);
        cs2 = findViewById(R.id.textView6);
        Intent intent = getIntent();
        cs1.setText(intent.getStringExtra("name"));
        cs2.setText(intent.getStringExtra("age"));
    }
}