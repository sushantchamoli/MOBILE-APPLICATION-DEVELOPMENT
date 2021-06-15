package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        output = findViewById(R.id.output);

        Intent i = getIntent();

        output.setText(i.getStringExtra("name"));
    }
}

