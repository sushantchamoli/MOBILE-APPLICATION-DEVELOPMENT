package com.example.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1 ,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        Intent intent = getIntent();
        t1.setText(intent.getStringExtra("name"));
        t2.setText(intent.getStringExtra("age"));
    }
}