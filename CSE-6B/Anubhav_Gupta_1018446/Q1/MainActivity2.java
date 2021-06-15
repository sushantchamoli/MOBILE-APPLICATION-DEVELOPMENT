package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    TextView t, t4, t5, t6;

    //this activity will display the name email age password
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        t = findViewById(R.id.textView4);
        t4 = findViewById(R.id.textView7);
        t5 = findViewById(R.id.textView);
        t6= findViewById(R.id.textView2);

        t.setText(i.getStringExtra("msg1"));
        t4.setText(i.getStringExtra("msg2"));
        t5.setText(i.getStringExtra("msg3"));
        t6.setText(i.getStringExtra("msg4"));
    }
}