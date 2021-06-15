package com.paad.extintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Act1 extends AppCompatActivity {
    TextView tv2,tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        String  name = getIntent().getStringExtra("Name");
        String  age = getIntent().getStringExtra("Age");
        tv2.setText("Name is "+name);
        tv3.setText("Age is "+age);

    }
}