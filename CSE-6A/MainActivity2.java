package com.example.ras;

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
        Intent i=getIntent();
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView3);
        t3=findViewById(R.id.textView4);
        t4=findViewById(R.id.textView5);
        t1.setText(i.getStringExtra("msg1"));
        t2.setText(i.getStringExtra("msg2"));
        t3.setText(i.getStringExtra("msg3"));
        t4.setText(i.getStringExtra("msg4"));

    }
}