package com.example.priyankalohani_labq1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    Intent i;
    TextView t1;

    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        t1=findViewById(R.id.tx101);
        t3=findViewById(R.id.tx301);
        i=getIntent();
        t1.setText(i.getStringExtra("msg1"));
        t3.setText(i.getStringExtra("msg3"));

    }
}