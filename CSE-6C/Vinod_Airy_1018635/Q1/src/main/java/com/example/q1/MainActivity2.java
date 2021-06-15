package com.example.q1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView t;
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t= findViewById(R.id.textView3);
        t2 = findViewById(R.id.textView);

        Intent i = getIntent();
        t.setText(i.getStringExtra("name"));
        t2.setText(i.getStringExtra("age"));

    }
}