package com.example.intentprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class q1_activity2 extends AppCompatActivity {
    //Archit Gupta 1018449
    //Local variables
    TextView output;
    TextView age1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Referencing to the text fields
        output = findViewById(R.id.output);
        age1 =findViewById(R.id.age1);
        //creating intent
        Intent i = getIntent();
        //printing values
        output.setText(i.getStringExtra("name"));
        age1.setText(i.getStringExtra("age"));
    }
}