package com.example.ankitsinghrawatlabtestapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.view1);
        t2=findViewById(R.id.view2);
        t3=findViewById(R.id.view3);
        t4=findViewById(R.id.view4);
        Intent i=getIntent();
        t1.setText(i.getStringExtra("msg1"));
        t3.setText(i.getStringExtra("msg3"));
    }
}
