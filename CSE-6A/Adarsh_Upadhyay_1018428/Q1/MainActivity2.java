package com.example.intentprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView output;
    TextView age1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        output = findViewById(R.id.output);
        age1 =findViewById(R.id.age1);

        Intent i = getIntent();

        output.setText(i.getStringExtra("name"));
        age1.setText(i.getStringExtra("age"));
    }
}