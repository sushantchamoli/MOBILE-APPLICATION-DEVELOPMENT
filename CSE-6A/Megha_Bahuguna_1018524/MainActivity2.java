package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Question1_b extends AppCompatActivity {
    TextView name;
    TextView age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1_b);
        name = findViewById(R.id.textView5);
        age = findViewById(R.id.textView6);
        Intent i = getIntent();
        name.setText(((Intent) i).getStringExtra("name"));
        age.setText(i.getStringExtra("age"));
    }
}