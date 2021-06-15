package com.example.end_sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
  TextView Name,Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Name=findViewById(R.id.names);
        Age=findViewById(R.id.ages);
        Intent i=getIntent();
        Name.setText(i.getStringExtra("Name"));
        Age.setText(i.getStringExtra("Age"));

    }
}