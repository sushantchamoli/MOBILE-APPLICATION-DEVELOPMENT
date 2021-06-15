package com.example.labtest_tusharojha_1;

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
        t1=findViewById(R.id.tx1);
        t3=findViewById(R.id.tx3);
        i=getIntent();
        t1.setText(i.getStringExtra("msg1"));
        t3.setText(i.getStringExtra("msg3"));

    }
}