package com.surya.loginform_suryapratap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        receiver_msg = (TextView)findViewById(R.id.received_value_id);
        String received = getIntent().getStringExtra("input");
        receiver_msg.setText(received);
    }}