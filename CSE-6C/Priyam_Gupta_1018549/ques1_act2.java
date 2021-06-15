package com.project.ques;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView text1;
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i=getIntent();
        text1=findViewById(R.id.textView5);
        text1.setText(i.getStringExtra("msg1"));
        text2=findViewById(R.id.textView6);
        text2.setText(i.getStringExtra("msg2"));

    }
}