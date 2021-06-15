package com.Sam.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name;
    TextView age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.textView5);
        age = findViewById(R.id.textView6);
        Intent i = getIntent();
        name.setText(i.getStringExtra("name"));
        age.setText(i.getStringExtra("age"));
    }
}