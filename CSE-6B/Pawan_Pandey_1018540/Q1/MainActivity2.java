package com.example.intentprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        output = findViewById(R.id.output);

        Intent i = getIntent();

        output.setText(i.getStringExtra("name"));
        output.setText(i.getStringExtra("Email"));
        output.setText(i.getStringExtra("Age"));
        output.setText(i.getStringExtra("Password"));
    }
}