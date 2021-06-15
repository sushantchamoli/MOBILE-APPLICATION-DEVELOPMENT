package com.example.intentprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView output;
    TextView o2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        output = findViewById(R.id.output);
        o2=findViewById(R.id.o2);

        Intent i = getIntent();

        output.setText(i.getStringExtra("name"));
        o2.setText(i.getStringExtra("age"));

    }
}