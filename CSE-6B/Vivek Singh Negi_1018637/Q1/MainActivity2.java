package com.example.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView2);
        Intent i = getIntent();
        textView.setText("Name="+i.getStringExtra("name"));
        textView1.setText("Age="+i.getStringExtra("age"));
    }
}