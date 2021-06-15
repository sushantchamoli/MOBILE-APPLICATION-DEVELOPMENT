package com.example.question1_BhaskarSinghBisht_1018471_C;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView output2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent current = getIntent();


        output2 = findViewById(R.id.output2);
        output2.setText(current.getStringExtra("name" ) + "  " + current.getStringExtra("age") );
    }
}