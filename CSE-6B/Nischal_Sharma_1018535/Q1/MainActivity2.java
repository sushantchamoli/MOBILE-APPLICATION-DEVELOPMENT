package com.example.q1signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    TextView t, t1, t2, t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        t = findViewById(R.id.textView4);
        t1 = findViewById(R.id.textView7);
        t2 = findViewById(R.id.textView);
        t3 = findViewById(R.id.textView2);

        t.setText(i.getStringExtra("msg1"));
        t1.setText(i.getStringExtra("msg2"));
        t2.setText(i.getStringExtra("msg3"));
        t3.setText(i.getStringExtra("msg4"));
    }
}