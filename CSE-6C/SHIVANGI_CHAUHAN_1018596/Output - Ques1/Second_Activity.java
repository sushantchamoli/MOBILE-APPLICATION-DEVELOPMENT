package com.example.two_activities_navigate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        msg = (TextView)findViewById(R.id.received_value_id);
        String received = getIntent().getStringExtra("input");
        msg.setText(received);
    }}
