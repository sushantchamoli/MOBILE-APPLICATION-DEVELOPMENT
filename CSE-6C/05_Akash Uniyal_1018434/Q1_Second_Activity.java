package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {
    TextView receiver_msg, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        Intent intent = getIntent();
        receiver_msg = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str = intent.getStringExtra("m1");
        String str2 = intent.getStringExtra("m2");
        // display the string into textView
        receiver_msg.setText(str);
        t2.setText(str2);
    }
}
