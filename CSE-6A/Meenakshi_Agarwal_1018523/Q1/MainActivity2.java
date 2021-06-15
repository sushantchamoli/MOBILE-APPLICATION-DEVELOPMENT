package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        t=findViewById(R.id.textView2);
        t.setText(i.getStringExtra("msg1"));
    }
}
